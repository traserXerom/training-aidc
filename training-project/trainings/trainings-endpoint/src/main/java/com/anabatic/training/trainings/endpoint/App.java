package com.anabatic.training.trainings.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.anabatic.generic.endpoint.controlleradvice.GenericControllerAdvice;


/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages = {
"com.anabatic.training.trainings.persistence.model"})
@ImportResource({
"classpath*:ApplicationContext-trainings-endpoint.xml",
"classpath*:ApplicationContext-trainings-persistence.xml",
"classpath*:ApplicationContext-trainings-service.xml",
"classpath*:applicationContext-generic-endpoint.xml",
"classpath*:applicationContext-generic-service.xml"})
@Import({
	WebSecurityConfiguration.class,
	GenericControllerAdvice.class
})
@ComponentScan(basePackages={"com.anabatic.training.trainings.endpoint.controller"})
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}