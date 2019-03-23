package com.anabatic.training.trainings.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.persistence.dto.Range;
import com.anabatic.generic.persistence.enums.Condition;
import com.anabatic.generic.persistence.enums.Order;
import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingDetailDao;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;

public class TrainingDetailServiceImpl extends TypicalGenericServiceImpl<TrainingDetail, Long> implements TrainingDetailDao {

	private TrainingDetailDao trainingDetailDao;

	@Autowired
	public void setTrainingDetailDao(TrainingDetailDao trainingDetailDao) {
		this.trainingDetailDao = trainingDetailDao;
		this.typicalGenericDao = trainingDetailDao;
		this.genericDao = trainingDetailDao;
	}


	@Override
	public List<TrainingDetail> getPagingResults(Integer firstResult, Integer maxResults, String orderBy, Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingDetail> getAllBy(Integer firstResult, Integer maxResult, String orderBy, Order order,
			Map<String, Object> parameters, Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingDetail> getAllByAndBetween(Integer firstResult, Integer maxResult, String orderBy, Order order,
			Map<String, Object> parameters, Range<?> range) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingDetail> getAll(String clientId, Map<String, Object> obj, Integer firstResult,
			Integer maxResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingDetail> getAll(String clientId, Map<String, Object> obj, Integer firstResult, Integer maxResult,
			Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
