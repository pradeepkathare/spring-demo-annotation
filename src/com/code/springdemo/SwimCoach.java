package com.code.springdemo;

import org.springframework.beans.factory.annotation.Value;

/*
 * Pradeep.kathare
 * In this class i haven't used any annotation for dependency injection
 * We use the JavaClass configuration for dependency injection
 */

public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "swimming is good for DailyWorkOut";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
}
