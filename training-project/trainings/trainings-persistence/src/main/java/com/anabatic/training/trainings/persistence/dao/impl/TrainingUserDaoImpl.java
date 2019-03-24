package com.anabatic.training.trainings.persistence.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.anabatic.generic.persistence.dao.impl.TypicalGenericDaoImpl;
import com.anabatic.training.trainings.persistence.dao.TrainingUserDao;
import com.anabatic.training.trainings.persistence.model.TrainingUser;

@Transactional
public class TrainingUserDaoImpl extends TypicalGenericDaoImpl<TrainingUser, Long> implements TrainingUserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<TrainingUser> getByTrainingId(Long id) {
		String query = "from TrainingUser as tu where tu.training.id = " + id;
		
		return (List<TrainingUser>)this.getEntityManager().createQuery(query).getResultList();
	}

}
