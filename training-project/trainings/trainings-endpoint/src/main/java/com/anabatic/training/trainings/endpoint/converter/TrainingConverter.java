package com.anabatic.training.trainings.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingRequest;
import com.anabatic.training.trainings.persistence.model.Training;

public interface TrainingConverter extends ToModelConverter<TrainingRequest, Training>, ToContractConverter<TrainingRequest, Training>{

}
