
package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradeep.kathare
 *
 */
public class AnnotatioBeanScopeDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
					
		//retrive the bean instance
		Coach theCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		//invoke the methods 
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("result : is theCoach and alphaCoach are same : "+result);
		
		System.out.println("Memory location of theCoach : "+theCoach);
		
		System.out.println("Memory Location of alphaCoach : "+alphaCoach);
		
		//close the application context
		applicationContext.close();
	}

}
