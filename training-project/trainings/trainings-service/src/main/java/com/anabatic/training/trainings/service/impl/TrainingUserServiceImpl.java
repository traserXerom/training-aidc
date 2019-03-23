package com.anabatic.training.trainings.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingUserDao;
import com.anabatic.training.trainings.persistence.model.TrainingUser;
import com.anabatic.training.trainings.service.TrainingUserService;

public class TrainingUserServiceImpl extends TypicalGenericServiceImpl<TrainingUser, Long> implements TrainingUserService{

	private TrainingUserDao trainingUserDao;

	@Autowired
	public void setTrainingUserDao(TrainingUserDao trainingUserDao) {
		this.trainingUserDao = trainingUserDao;
		this.typicalGenericDao = trainingUserDao;
		this.genericDao = trainingUserDao;
	}
	
	
}
