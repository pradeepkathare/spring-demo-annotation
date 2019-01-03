package com.code.springdemo;

import org.springframework.stereotype.Component;

/*
 * Pradeep.kathare
 */
@Component
public class RESTFortuneService implements FortuneService{

	public RESTFortuneService() {
		System.out.println("\nRESTFortuneService  : no-arg-constructor ");
	}
	@Override
	public String getFortune() {
	 return "I am RESTFortuneService ";
		
	}

}
