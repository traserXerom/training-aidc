package com.anabatic.training.users.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatic.training.users.endpoint.converter.UserConverter;
import com.anabatic.training.users.endpoint.param.contract.UserGetByIdRequest;
import com.anabatic.training.users.endpoint.param.contract.UserInsertRequest;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserConverter userConverter;
	
	@PostMapping("")
	public ResponseEntity<BaseResponse> getAll(){
		List<User> users = userService.getAll();
		
		BaseResponse response = new BaseResponse();
		response.setResponse(users);
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody UserInsertRequest userRequest){
		ValidationCheck.hasValidate(userRequest);
		User user = userConverter.toModel(userRequest);
		user = userService.save(user);
		
		BaseResponse response = new BaseResponse();
		response.setResponse(userConverter.toContract(user));
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/getbyid")
	public ResponseEntity<BaseResponse> getById(@RequestBody UserGetByIdRequest userGetByIdRequest){
		ValidationCheck.hasValidate(userGetByIdRequest);
		User user = userService.get(userGetByIdRequest.getId());
		
		BaseResponse response = new BaseResponse();
		response.setResponse(userConverter.toContract(user));
		return ResponseEntity.ok().body(response);
	}
}
