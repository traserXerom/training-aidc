package com.anabatic.training.trainings.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.generic.core.util.DateUtil;
import com.anabatic.training.trainings.persistence.configuration.BaseDaoTest;
import com.anabatic.training.trainings.persistence.model.Training;
import com.anabatic.training.trainings.persistence.model.TrainingDetail;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
public class TrainingUserTest extends BaseDaoTest {
	
	@Autowired
	private TrainingUserDao trainingUserDao;
	
	Training trainingObject;

	@Override
	protected String getDataSet() {
		// TODO Auto-generated method stub
		return "trainings-training-dataset.xml";
	}
	
	
	
	@Before
	public void before() {
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
		trainingObject = training;
		
	}
	
	@Test
	public void testFindById() {
		TrainingUser trainingUser = trainingUserDao.get(11L);
		
		TrainingUser expectedTrainingUser = new TrainingUser();
		expectedTrainingUser.setId(11L);
		expectedTrainingUser.setUserId(11L);
		expectedTrainingUser.setTraining(trainingObject);
		
		assertEquals(expectedTrainingUser.toString(), trainingUser.toString());
	}	
		
	@Test
	public void testInsertAndFind() {
		TrainingUser trainingUser = new TrainingUser();
		trainingUser.setClientId("123123123");
		trainingUser.setUserId(11L);
		trainingUser.setTraining(trainingObject);
		
		TrainingUser trainingUserNew = new TrainingUser();
		trainingUserNew = trainingUserDao.save(trainingUser);
		
		trainingUser.setId(trainingUserNew.getId());
		
		//Training trainingCompare = new Training();
		//trainingCompare = trainingDao.get(trainingNew.getId());
		
		
		assertEquals(trainingUser.toString(), trainingUserNew.toString());
	}

}
