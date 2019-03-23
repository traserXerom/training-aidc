package com.anabatic.training.users.service.impl;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.service.UserService;

public class UserServiceImpl extends TypicalGenericServiceImpl<User, Long> implements UserService{

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		this.typicalGenericDao = userDao;
		this.genericDao = userDao;
	}
	
	
}
