package com.code.springdemo;

import org.springframework.stereotype.Component;

/*
 * Pradeep.kathare
 */
@Component
public class DataBaseFortuneService implements FortuneService{

	public DataBaseFortuneService() {
		System.out.println("\nDataBaseFortuneService  : no-arg-constructor ");
	}
	@Override
	public String getFortune() {
	 return "I am DataBaseFortuneService ";
		
	}

}
