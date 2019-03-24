package com.anabatic.training.trainings.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
public class TrainingDaoTest extends BaseDaoTest {
	
	@Autowired
	private TrainingDao trainingDao;

	@Override
	protected String getDataSet() {
		// TODO Auto-generated method stub
		return "trainings-training-dataset.xml";
	}

	@Test
	public void testFindById() {
		Training training = trainingDao.get(11L);
		
		Training expectedTraining = new Training();
		expectedTraining.setId(11L);
		expectedTraining.setName("eleven_training");
		expectedTraining.setDescription("training sebelas");
		
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
		expectedTraining.setTrainingDetail(trainingDetail);
		
		assertEquals(training.toString(), expectedTraining.toString());
	}	
		
	@Test
	public void testInsertAndFind() {
		
		Training training = new Training();
		training.setClientId("123123");
		training.setName("first_training");
		training.setDescription("training pertama");
		
		TrainingDetail trainingDetail = new TrainingDetail();
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
		trainingDetail.setClientId("123123");
		training.setTrainingDetail(trainingDetail);
		
		Training trainingNew = new Training();
		trainingNew = trainingDao.save(training);
		
		training.setId(trainingNew.getId());
		training.getTrainingDetail().setId(trainingNew.getTrainingDetail().getId());
		
		//Training trainingCompare = new Training();
		//trainingCompare = trainingDao.get(trainingNew.getId());
		
		
		assertEquals(trainingNew.toString(), training.toString());
	}
}
