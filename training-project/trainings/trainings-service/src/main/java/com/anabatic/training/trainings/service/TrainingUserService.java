package com.anabatic.training.trainings.service;

import java.util.List;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

public interface TrainingUserService extends TypicalGenericService<TrainingUser, Long> {
	List<TrainingUser> getByTrainingId(Long id);
}
