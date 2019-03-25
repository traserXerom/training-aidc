package com.anabatic.training.trainings.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.generic.core.util.DateUtil;
import com.anabatic.training.trainings.persistence.dao.TrainingUserDao;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;
import com.anabatic.training.trainings.persistence.model.TrainingUser;
import com.anabatic.training.trainings.service.TrainingUserService;
import com.anabatic.training.trainings.service.configuration.ServiceConfiguration;
import com.anabatic.training.trainings.service.impl.TrainingUserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Import(ServiceConfiguration.class)
public class TrainingUserServiceTest {
	
	@Mock
	private TrainingUserDao trainingUserDao;
	
	@InjectMocks
	private TrainingUserService trainingUserService = new TrainingUserServiceImpl();
	
	
	TrainingUser trainingUserDummy;
	
	@Before
	public void initialized() {
		MockitoAnnotations.initMocks(this);
				
		Training training = new Training();
		training.setId(11L);
		training.setName("eleven_training");
		training.setDescription("training sebelas");
		
		TrainingDetail trainingDetail = new TrainingDetail();
		trainingDetail.setId(11L);
		trainingDetail.setLocation("Jakarta");
		try {
			trainingDetail.setTrainingStartDate(DateUtil.convertStringToDate("2019-01-01"));
			trainingDetail.setTrainingEndDate(DateUtil.convertStringToDate("2019-01-10"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trainingDetail.setTrainerName("trainer sebelas");
		trainingDetail.setTime(60);
		training.setTrainingDetail(trainingDetail);
		
		trainingUserDummy = new TrainingUser();
		trainingUserDummy.setId(11L);
		trainingUserDummy.setUserId(11L);
		trainingUserDummy.setTraining(training);
	}
	
	@Test
	public void testInsert() {
		TrainingUser trainingUser = new TrainingUser();
		trainingUser.setUserId(11L);
		
		Training training = new Training();
		training.setId(11L);
		training.setName("eleven_training");
		training.setDescription("training sebelas");
		
		TrainingDetail trainingDetail = new TrainingDetail();
		trainingDetail.setId(11L);
		trainingDetail.setLocation("Jakarta");
		try {
			trainingDetail.setTrainingStartDate(DateUtil.convertStringToDate("2019-01-01"));
			trainingDetail.setTrainingEndDate(DateUtil.convertStringToDate("2019-01-10"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trainingDetail.setTrainerName("trainer sebelas");
		trainingDetail.setTime(60);
		training.setTrainingDetail(trainingDetail);
		trainingUser.setTraining(training);
		
		when(trainingUserDao.save(trainingUser)).thenReturn(trainingUserDummy);
		
		TrainingUser trainingUserNew = new TrainingUser();
		trainingUserNew = trainingUserService.save(trainingUser);
		
		trainingUser.setId(trainingUserNew.getId());
		
		assertEquals(trainingUserNew.toString(), trainingUser.toString());
		
	}
	
}
