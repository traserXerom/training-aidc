package com.anabatic.training.users.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.training.users.endpoint.param.contract.RoleRequest;
import com.anabatic.training.users.endpoint.param.contract.RoleResponse;
import com.anabatic.training.users.persistence.model.Role;

public interface RoleConverter extends ToModelConverter<RoleRequest, Role>, ToContractConverter<Role, RoleResponse> {

}
