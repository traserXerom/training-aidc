package com.anabatic.training.users.service.validator;

import com.anabatic.generic.service.validator.BaseValidator;
import com.anabatic.training.users.persistence.model.User;

public interface UserInsertValidator extends BaseValidator<User>{
	Boolean isRoleExist(Long id);
}
