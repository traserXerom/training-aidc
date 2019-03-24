package com.anabatic.training.trainings.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingUserRequest;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

public interface TrainingUserConverter extends ToModelConverter<TrainingUserRequest, TrainingUser>, ToContractConverter<TrainingUser, TrainingUserRequest> {

}
