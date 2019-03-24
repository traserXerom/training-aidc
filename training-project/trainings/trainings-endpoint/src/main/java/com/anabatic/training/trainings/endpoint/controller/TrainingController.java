package com.anabatic.training.trainings.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.training.trainings.endpoint.converter.TrainingConverter;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingRequest;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.validator.TrainingValidationCheck;
import com.anabatic.training.trainings.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
	private TrainingService trainingService;
	
	@Autowired
	private TrainingConverter converter;
	
	@PostMapping("")
	public ResponseEntity<BaseResponse> getAll(){
		List<Training> trainings = trainingService.getAll();
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContracts(trainings));
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody TrainingRequest request){
		TrainingValidationCheck.hasValidate(request);
		Training training = converter.toModel(request);
		training = trainingService.save(training);
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContract(training));
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/get")
	public ResponseEntity<BaseResponse> get(@RequestBody TrainingRequest request){
		Training training = new Training();
		training = trainingService.get(request.getTraining().getId());
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContract(training));
		
		return ResponseEntity.ok().body(response);
	}
}
