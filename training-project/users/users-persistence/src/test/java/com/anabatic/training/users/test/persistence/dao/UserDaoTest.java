package com.anabatic.training.users.test.persistence.dao;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.training.users.persistence.dao.RoleDao;
import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.test.persistence.configuration.BaseDaoTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest extends BaseDaoTest{

	@Override
	protected String getDataSet() {
		// TODO Auto-generated method stub
		return "training-user-dataset.xml";
	}
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDao;
	
	@Test
	public void testFindById() {
		User user = userDao.get(3L);
		System.out.println(user.getRole());
		assertEquals(new Long(3), user.getId());
		
	}
	
	@Test
	public void testInsertAndFind() {
		User userNew = new User("user_5", "user_pass_5", roleDao.get(1L));
		userNew = userDao.save(userNew);
		
		User userGet = userDao.get(userNew.getId());
		assertEquals(userNew.toString(), userGet.toString());
		
	}

}
