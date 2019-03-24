package com.anabatic.training.users.endpoint.param.contract;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class UserGetByIdRequest {
	@IsRequired
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
