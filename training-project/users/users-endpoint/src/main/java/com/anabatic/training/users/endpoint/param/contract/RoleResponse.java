package com.anabatic.training.users.endpoint.param.contract;

import java.util.List;

import com.anabatic.training.users.endpoint.param.bean.UserBean;

public class RoleResponse {
	private Long id;
	private String name;
	private List<UserBean> users;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
}
