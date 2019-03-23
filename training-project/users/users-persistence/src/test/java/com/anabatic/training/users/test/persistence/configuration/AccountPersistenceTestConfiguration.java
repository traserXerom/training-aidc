package com.anabatic.training.users.test.persistence.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.anabatic.generic.test.persistence.configuration.CorePersistenceConfigurationTest;


@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath*:applicationContext-users-persistence.xml" })
public abstract class AccountPersistenceTestConfiguration  extends CorePersistenceConfigurationTest{
	@Override
	protected String[] getPackageScan() {
		return new String[] { "com.anabatic.training.users.persistence.model" };
	}
	
	
	
}
