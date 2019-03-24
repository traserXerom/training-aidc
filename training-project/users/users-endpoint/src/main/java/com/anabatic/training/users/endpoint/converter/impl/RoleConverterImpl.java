package com.anabatic.training.users.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.training.users.endpoint.converter.RoleConverter;
import com.anabatic.training.users.endpoint.param.bean.UserBean;
import com.anabatic.training.users.endpoint.param.contract.RoleRequest;
import com.anabatic.training.users.endpoint.param.contract.RoleResponse;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.persistence.model.User;

public class RoleConverterImpl implements RoleConverter {

	@Override
	public Role toModel(RoleRequest object) {
		Role role = new Role();
		if(object.getId()!=null) {
			role.setId(object.getId());
		}
		role.setClientId("1");
		role.setName(object.getName());
		return role;
	}

	@Override
	public List<Role> toModels(List<RoleRequest> objects) {
		List<Role> roles = new ArrayList<>();
		objects.stream().forEach(x -> 
		roles.add(toModel(x))
				);
		return roles;
	}

	@Override
	public RoleResponse toContract(Role object) {
		RoleResponse role = new RoleResponse();
		if(object.getId()!=null) {
			role.setId(object.getId());
		}
		role.setName(object.getName());
		return role;
	}

	@Override
	public List<RoleResponse> toContracts(List<Role> objects) {
		List<RoleResponse> roles = new ArrayList<>();
		objects.stream().forEach(x -> 
		roles.add(toContract(x))
				);
		return roles;
	}
}
