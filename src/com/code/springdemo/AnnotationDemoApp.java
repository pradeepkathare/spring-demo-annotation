package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Pradeep.kathare
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//reterv the bean class
		Coach theCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		//call the dailyworkout method 
		System.out.println("theCoach : "+theCoach.getDailyWorkOut());

		//call the dailyFortune method
		System.out.println("\nfortuneService : "+theCoach.getDailyFortune());
		
		//close the application
		applicationContext.close();
	}
}
