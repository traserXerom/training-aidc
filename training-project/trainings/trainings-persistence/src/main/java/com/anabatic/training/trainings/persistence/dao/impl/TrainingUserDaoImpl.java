package com.anabatic.training.trainings.persistence.dao.impl;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingUserDao;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

@Transactional
public class TrainingUserDaoImpl extends TypicalGenericDaoImpl<TrainingUser, Long> implements TrainingUserDao {

}
