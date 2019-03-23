package com.anabatic.training.trainings.endpoint.converter.impl;

import java.util.List;

import com.anabatic.training.trainings.endpoint.converter.TrainingConverter;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingRequest;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;

public class TrainingConverterImpl implements TrainingConverter{

	@Override
	public Training toModel(TrainingRequest object) {
		Training training = new Training();
		
		if(object.getId()!=null) {
			training.setId(object.getId());
		}
		training.setName(object.getTrainingName());
		training.setDescription(object.getTraining_description());
		training.setTrainingDetail(new TrainingDetail());
		training.setClientId("1");
		training.getTrainingDetail().setLocation(object.getLocation());
		training.getTrainingDetail().setTrainingDate(object.getTrainingDate());
		training.getTrainingDetail().setTrainingName(object.getTrainerName());
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
	public Training toContract(TrainingRequest object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> toContracts(List<TrainingRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
