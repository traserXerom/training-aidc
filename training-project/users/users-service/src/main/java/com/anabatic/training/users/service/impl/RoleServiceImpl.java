package com.anabatic.training.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.users.persistence.dao.RoleDao;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.service.RoleService;

public class RoleServiceImpl extends TypicalGenericServiceImpl<Role, Long> implements RoleService {
	
	private RoleDao roleDao;

	@Autowired
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
		this.typicalGenericDao = roleDao;
		this.genericDao = roleDao;
	}
	
}
