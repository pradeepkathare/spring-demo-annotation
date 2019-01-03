package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

/*
 * Pradeep.kathare
 */
@Component
public class RandomFortuneService implements FortuneService{

	String []arr = {"abc","def","ghi"};
	Random random = new Random();
	public RandomFortuneService() {
		System.out.println("\nRandomFortuneService  : no-arg-constructor ");
	}
	@Override
	public String getFortune() {
		int index = random.nextInt(arr.length);
		String result = arr[index];
	 return result;
		
	}

}
