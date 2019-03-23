package com.anabatic.training.users.endpoint.converter;

import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.training.users.endpoint.param.contract.UserRequest;
import com.anabatic.training.users.persistence.model.User;

public interface UserConverter extends ToModelConverter<UserRequest, User> {

}
