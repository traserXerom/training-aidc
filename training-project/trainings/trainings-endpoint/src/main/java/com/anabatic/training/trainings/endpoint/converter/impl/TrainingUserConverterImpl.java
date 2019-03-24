package com.anabatic.training.trainings.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.training.trainings.endpoint.converter.TrainingUserConverter;
import com.anabatic.training.trainings.endpoint.param.bean.TrainingBean;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingUserRequest;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.model.TrainingUser;
import com.anabatic.training.trainings.service.TrainingService;

public class TrainingUserConverterImpl implements TrainingUserConverter {
	
	@Autowired
	private TrainingService trainingService;
	
	@Override
	public TrainingUser toModel(TrainingUserRequest object) {
		TrainingUser trainingUser = new TrainingUser();
		trainingUser.setClientId("123123123");
		
		Training training = new Training();
		training = trainingService.get(object.getTrainingBean().getId());
		trainingUser.setTraining(training);
		
		if(object.getId()!=null) {
			trainingUser.setId(object.getId());
		}
		
		return trainingUser;
	}

	@Override
	public List<TrainingUser> toModels(List<TrainingUserRequest> objects) {
		
		List<TrainingUser> trainingUsers= new ArrayList<TrainingUser>();
		for (TrainingUserRequest trainingUserRequest : objects) {
			trainingUsers.add(toModel(trainingUserRequest));
		}
		
		return trainingUsers;
	}

	@Override
	public TrainingUserRequest toContract(TrainingUser object) {
		TrainingUserRequest request = new TrainingUserRequest();
		request.setId(object.getId());
		
		TrainingBean trainingBean = new TrainingBean();
		trainingBean.setId(object.getTraining().getId());
		trainingBean.setTrainingName(object.getTraining().getName());
		trainingBean.setTraining_description(object.getTraining().getDescription());
		trainingBean.setLocation(object.getTraining().getTrainingDetail().getLocation());
		trainingBean.setTime(object.getTraining().getTrainingDetail().getTime());
		trainingBean.setTrainingStartDate(object.getTraining().getTrainingDetail().getTrainingStartDate());
		trainingBean.setTrainingEndDate(object.getTraining().getTrainingDetail().getTrainingEndDate());
		trainingBean.setTrainerName(object.getTraining().getTrainingDetail().getTrainerName());
		
		request.setTrainingBean(trainingBean);
		request.setUserId(object.getUserId());
		return request;
	}

	@Override
	public List<TrainingUserRequest> toContracts(List<TrainingUser> objects) {
		List<TrainingUserRequest> trainingUserRequests = new ArrayList<TrainingUserRequest>();
		for (TrainingUser trainingUser : objects) {
			trainingUserRequests.add(toContract(trainingUser));
		}
		return trainingUserRequests;
	}

}
