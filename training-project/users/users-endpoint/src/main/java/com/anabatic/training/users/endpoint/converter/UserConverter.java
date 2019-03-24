package com.anabatic.training.users.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.training.users.endpoint.param.contract.UserInsertRequest;
import com.anabatic.training.users.endpoint.param.contract.UserResponse;
import com.anabatic.training.users.persistence.model.User;

public interface UserConverter extends ToModelConverter<UserInsertRequest, User>, ToContractConverter<User, UserResponse> {

}
