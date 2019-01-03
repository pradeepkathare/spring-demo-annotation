/**
 * 
 */
package com.code.springdemo;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Pradeep.kathare
 *
 */
public class SwimJavaBasedDIDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//load the configuration class not the xml
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrvie the bean  from the container 
				SwimCoach theCoach = applicationContext.getBean("swimCoach",SwimCoach.class);
		//call the methods 
				System.out.println("\ntheCoach : "+theCoach.getDailyWorkOut());
				
				System.out.println("\nfortune : "+theCoach.getDailyFortune());
		
				System.out.println("\nemail  : "+theCoach.getEmail());
				
				System.out.println("\nTeam : "+theCoach.getTeam());
		//close the application 
				applicationContext.close();
	}

}
