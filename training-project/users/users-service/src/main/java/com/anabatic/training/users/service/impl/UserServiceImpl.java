package com.anabatic.training.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.service.RoleService;
import com.anabatic.training.users.service.UserService;
import com.anabatic.training.users.service.validator.UserInsertValidator;

public class UserServiceImpl extends TypicalGenericServiceImpl<User, Long> implements UserService{

	@Autowired
	private UserInsertValidator userInsertValidator;
	
	@Autowired
	private RoleService roleService;
	
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		this.typicalGenericDao = userDao;
		this.genericDao = userDao;
	}

	@Override
	public User save(User model) {
		userInsertValidator.validate(model);
		Role role = roleService.get(model.getRole().getId());
		model.setRole(role);
		return super.save(model);
	}
	
	
}
