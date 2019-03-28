package com.anabatic.aggregator.engine;

import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.anabatic.messaging.annotations.AnabaticBEVerison;
import com.anabatic.messaging.configuration.ConfigJmsVersion;

@SpringBootApplication
@AnabaticBEVerison(applicationName = "base-aggregator", version = "v.0.0.1")
public class AppStart {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppStart.class, args);
	}
	@Bean
	public BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor() {
		return new ConfigJmsVersion(AppStart.class).doOverideJmsListener();
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
