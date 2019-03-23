package com.anabatic.training.trainings.persistence.dao.impl;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingDetailDao;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;

@Transactional
public class TrainingDetailDaoImpl extends TypicalGenericDaoImpl<TrainingDetail, Long> implements TrainingDetailDao{

}
