package com.anabatic.training.trainings.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingDao;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.service.TrainingService;

public class TrainingServiceImpl extends TypicalGenericServiceImpl<Training, Long> implements TrainingService {

	private TrainingDao trainingDao;

	@Autowired
	public void setTrainingDao(TrainingDao trainingDao) {
		this.trainingDao = trainingDao;
		this.typicalGenericDao = trainingDao;
		this.genericDao = trainingDao;
	}
	
	
}
