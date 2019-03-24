package com.anabatic.training.users.service.validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.core.exception.GeneralException;
import com.anabatic.traiing.users.core.constant.UserErrorConstant;
import com.anabatic.traiing.users.core.exception.UserException;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.service.RoleService;

public class UserInsertValidatorImpl implements UserInsertValidator{

	@Autowired
	private RoleService roleService;
	
	@Override
	public boolean validate(User obj) {
		isRoleExist(obj.getRole().getId());
		return true;
	}

	@Override
	public Boolean isRoleExist(Long id) {
		try {
			roleService.get(id);
		} catch (GeneralException e) {
			throw new UserException(UserErrorConstant.ROLE_NOT_FOUND);
		}
		return true;
	}

}
