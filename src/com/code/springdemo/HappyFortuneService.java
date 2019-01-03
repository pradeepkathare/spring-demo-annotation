package com.code.springdemo;

import org.springframework.stereotype.Component;

/*
 * Pradeep.kathare
 */
@Component
public class HappyFortuneService implements FortuneService{

	public HappyFortuneService() {
		System.out.println("\nHappyFortuneService  : no-arg-constructor ");
	}
	@Override
	public String getFortune() {
	 return "I am happyFortuneServiuce ";
		
	}

}
