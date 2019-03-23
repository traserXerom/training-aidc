package com.anabatic.training.users.persistence.dao.impl;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.User;

@Transactional
public class UserDaoImpl extends TypicalGenericDaoImpl<User, Long> implements UserDao {

}
