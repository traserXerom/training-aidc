package com.anabatic.training.users.test.persistence.configuration;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anabatic.generic.test.persistence.configuration.AbstractDbUnitJpaTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AccountPersistenceTestConfiguration.class })
public abstract class BaseDaoTest extends AbstractDbUnitJpaTest{

}
