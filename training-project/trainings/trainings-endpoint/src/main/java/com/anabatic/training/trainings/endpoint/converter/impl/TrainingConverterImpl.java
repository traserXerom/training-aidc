package com.anabatic.training.trainings.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.training.trainings.endpoint.converter.TrainingConverter;
import com.anabatic.training.trainings.endpoint.param.bean.TrainingBean;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingRequest;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;

public class TrainingConverterImpl implements TrainingConverter{

	@Override
	public Training toModel(TrainingRequest object) {
		Training training = new Training();
		
		if(object.getTraining().getId()!=null) {
			training.setId(object.getTraining().getId());
		}
		training.setName(object.getTraining().getTrainingName());
		training.setDescription(object.getTraining().getTraining_description());
		training.setTrainingDetail(new TrainingDetail());
		training.setClientId("1");
		training.getTrainingDetail().setLocation(object.getTraining().getLocation());
		training.getTrainingDetail().setTrainerName(object.getTraining().getTrainerName());
		training.getTrainingDetail().setTrainingStartDate(object.getTraining().getTrainingStartDate());
		training.getTrainingDetail().setTrainingEndDate(object.getTraining().getTrainingEndDate());
		training.getTrainingDetail().setTime(object.getTraining().getTime());
		training.getTrainingDetail().setClientId("1");
		training.getTrainingDetail().setTraining(training);
		return training;
	}
	

	@Override
	public List<Training> toModels(List<TrainingRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrainingRequest toContract(Training object) {
		TrainingBean trainingBean = new TrainingBean();
		trainingBean.setId(object.getId());
		trainingBean.setTrainingName(object.getName());
		trainingBean.setTraining_description(object.getDescription());
		trainingBean.setLocation(object.getTrainingDetail().getLocation());
		trainingBean.setTrainingStartDate(object.getTrainingDetail().getTrainingStartDate());
		trainingBean.setTrainingEndDate(object.getTrainingDetail().getTrainingEndDate());
		trainingBean.setTime(object.getTrainingDetail().getTime());
		trainingBean.setTrainerName(object.getTrainingDetail().getTrainerName());
		
		TrainingRequest request = new TrainingRequest();
		request.setTraining(trainingBean);
		
		return request;
	}


	@Override
	public List<TrainingRequest> toContracts(List<Training> objects) {
		List<TrainingRequest> trainingRequests = new ArrayList<TrainingRequest>();
		
		for (Training object : objects) {
			trainingRequests.add(toContract(object));
		}
	
		return trainingRequests;
	}

	
	

}
