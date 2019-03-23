package com.anabatic.training.users.persistence.dao.impl;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.users.persistence.dao.RoleDao;
import com.anabatic.training.users.persistence.model.Role;

@Transactional
public class RoleDaoImpl extends TypicalGenericDaoImpl<Role, Long> implements RoleDao {

}
