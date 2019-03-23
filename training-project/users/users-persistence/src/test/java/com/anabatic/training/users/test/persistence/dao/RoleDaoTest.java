package com.anabatic.training.users.test.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.training.users.persistence.dao.RoleDao;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.test.persistence.configuration.BaseDaoTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
public class RoleDaoTest extends BaseDaoTest{
	
	@Autowired
	private RoleDao roleDao;

	@Override
	protected String getDataSet() {
		// TODO Auto-generated method stub
		return "training-role-dataset.xml";
	}

	 @Test
	public void testFindById() {
		Role role = roleDao.get(4L);
		System.out.println(role.toString());
		
		Role expectedRole =new Role();
		expectedRole.setId(4L);
		expectedRole.setClientId("123123123");
		expectedRole.setName("role_2");
		
		
		assertEquals(expectedRole.getId(), role.getId());
	}	
		
	//@Test
	public void testInsertAndFind() {
		Role roleCompare = new Role("role_3");
		
		List<User> users = new ArrayList<User>();
		users.add(new User("user_name_1", "user_pass_1", roleCompare));
		users.add(new User("user_name_2", "user_pass_2", roleCompare));
		
		roleCompare.setUsers(users);
		roleCompare = roleDao.save(roleCompare);
		System.out.println(roleCompare.toString());
		
		for (User user : roleCompare.getUsers()) {
			System.out.println(user.toString());
		}
	}
}
