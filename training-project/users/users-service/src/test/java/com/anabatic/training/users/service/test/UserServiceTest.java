package com.anabatic.training.users.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.Role;
import com.anabatic.training.users.persistence.model.User;
import com.anabatic.training.users.service.RoleService;
import com.anabatic.training.users.service.impl.UserServiceImpl;
import com.anabatic.training.users.service.validator.UserInsertValidator;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest {

	@Mock
	private UserDao userDao;
	@Mock
	private RoleService roleService;
	@Mock
	private UserInsertValidator userInsertValidator;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	private User userDummy;
	private Role roleDummy;

	@Before
	public void initialize() {
		MockitoAnnotations.initMocks(this);
		roleDummy = new Role(1L, "admin");
		userDummy = new User("vicky", "password", roleDummy);
	}

	@Test
	public void test01SaveUser() {
		when(userInsertValidator.validate(userDummy)).thenReturn(Boolean.TRUE);
		when(roleService.get(1L)).thenReturn(roleDummy);
		when(userDao.save(userDummy)).thenReturn(userDummy);
		
		User result = userServiceImpl.save(userDummy);
		
		assertEquals(userDummy.toString(), result.toString());
	}
}
