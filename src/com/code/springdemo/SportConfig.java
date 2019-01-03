package com.code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService(); 
	}
	
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
