package com.anabatic.training.trainings.service.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath*:ApplicationContext-trainings-service.xml" })
public class ServiceConfiguration {

}
