package com.anabatic.training.users.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages = {
"com.anabatic.training.users.persistence.model"})
@ImportResource({
"classpath*:applicationContext-users-endpoint.xml",
"classpath*:applicationContext-users-persistence.xml",
"classpath*:applicationContext-users-service.xml",
"classpath*:applicationContext-generic-endpoint.xml",
"classpath*:applicationContext-generic-service.xml"})
@ComponentScan(basePackages={"com.anabatic.training.users.endpoint.controller"})
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
