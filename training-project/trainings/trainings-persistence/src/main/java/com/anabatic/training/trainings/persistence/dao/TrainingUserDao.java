package com.anabatic.training.trainings.persistence.dao;

import java.util.List;

import com.anabatic.generic.persistence.dao.TypicalGenericDao;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

public interface TrainingUserDao extends TypicalGenericDao<TrainingUser, Long> {

		List<TrainingUser> getByTrainingId(Long id);
}
