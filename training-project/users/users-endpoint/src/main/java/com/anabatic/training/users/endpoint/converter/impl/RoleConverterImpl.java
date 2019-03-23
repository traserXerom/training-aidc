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
		role.setUsers(new ArrayList<User>());
		for (UserBean userBean : object.getUsers()) {
			User user = new User();
			user.setName(userBean.getName());
			user.setPassword(userBean.getPass());
			user.setClientId("1");
			user.setRole(role);
			role.getUsers().add(user);
		}
		
		return role;
	}

	

//	@Override
//	public RoleResponse toContract(Role role) {
//		RoleResponse response = new RoleResponse();
//		response.setId(role.getId());
//		response.setName(role.getName());
//		
//		List<UserBean> users = new ArrayList<UserBean>();
//		for (User user : role.getUsers()) {
//			UserBean bean = new UserBean();
//			bean.setName(user.getName());
//			bean.setPass(user.getPassword());
//			
//		}
//		response.setUsers(users);
//		
//		return response;
//	}



	@Override
	public List<Role> toModels(List<RoleRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Role toContract(RoleResponse object) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Role> toContracts(List<RoleResponse> objects) {
		// TODO Auto-generated method stub
		return null;
	}


}
