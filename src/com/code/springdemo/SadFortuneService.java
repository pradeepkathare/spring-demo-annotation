package com.code.springdemo;

public class SadFortuneService implements FortuneService {

	public SadFortuneService() {
		System.out.println("SadFortuneService : no-arg constructor");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "I am sad fortune";
	}

}
