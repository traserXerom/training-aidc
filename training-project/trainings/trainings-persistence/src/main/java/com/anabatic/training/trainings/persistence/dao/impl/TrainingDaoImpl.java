package com.anabatic.training.trainings.persistence.dao.impl;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingDao;
import com.anabatic.training.trainings.persistence.model.Training;

@Transactional
public class TrainingDaoImpl extends TypicalGenericDaoImpl<Training, Long> implements TrainingDao {

}
