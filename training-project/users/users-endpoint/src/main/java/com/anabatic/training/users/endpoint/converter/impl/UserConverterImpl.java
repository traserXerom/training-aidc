package com.anabatic.training.users.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.training.users.endpoint.converter.UserConverter;
import com.anabatic.training.users.endpoint.param.contract.UserInsertRequest;
import com.anabatic.training.users.endpoint.param.contract.UserResponse;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.persistence.model.User;

public class UserConverterImpl implements UserConverter {

	@Override
	public User toModel(UserInsertRequest object) {
		User user = new User();
		user.setName(object.getName());
		user.setPassword(object.getPass());
		Role role = new Role();
		role.setId(object.getRole());
		user.setRole(role);
		user.setClientId("1");
		return user;
	}

	@Override
	public List<User> toModels(List<UserInsertRequest> objects) {
		List<User> users = new ArrayList<>();
		objects.stream().forEach(x -> 
		users.add(toModel(x))
				);
		return users;
	}

	@Override
	public UserResponse toContract(User object) {
		UserResponse user = new UserResponse();
		user.setId(object.getId());
		user.setName(object.getName());
		user.setPass(object.getPassword());
		user.setRole(object.getRole());
		return user;
	}

	@Override
	public List<UserResponse> toContracts(List<User> objects) {
		List<UserResponse> users = new ArrayList<>();
		objects.stream().forEach(x -> 
		users.add(toContract(x))
				);
		return users;
	}
}
