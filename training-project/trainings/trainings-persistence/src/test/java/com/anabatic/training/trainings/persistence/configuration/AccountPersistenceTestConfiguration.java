package com.anabatic.training.trainings.persistence.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.anabatic.generic.persistence.configuration.GenericPersistenceConfigurationTest;


@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath*:ApplicationContext-trainings-persistence.xml" })
public abstract class AccountPersistenceTestConfiguration  extends GenericPersistenceConfigurationTest{
	@Override
	protected String[] getPackageScan() {
		return new String[] { "com.anabatic.training.trainings.persistence.model" };
	}
	
	
	
}
