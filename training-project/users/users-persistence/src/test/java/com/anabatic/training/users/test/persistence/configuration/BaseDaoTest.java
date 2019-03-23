package com.anabatic.training.users.test.persistence.configuration;

import org.springframework.test.context.ContextConfiguration;

import com.anabatic.generic.persistence.configuration.AbstractDbUnitJpaTest;

@ContextConfiguration(classes = { AccountPersistenceTestConfiguration.class })
public abstract class BaseDaoTest extends AbstractDbUnitJpaTest{

}
