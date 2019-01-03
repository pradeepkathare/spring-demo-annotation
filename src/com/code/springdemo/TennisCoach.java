/**
 * 
 */
package com.code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Pradeep.kathare
 *
 */
@Component("tennisCoach")
//@Scope("prototype") //destroy method will not be called for prototype method
public class TennisCoach implements Coach{

	//field injection : autowire can be used on fields directly
	@Autowired
	//@Qualifier("RESTFortuneService") // If we have multiple components then we have to use @qualier to specify to autowire properly
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	TennisCoach( ){
		System.out.println("TennisCoach : no-arg constructor");
	}
	
	/*  @Autowired
	    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

	        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
	        
	        fortuneService = theFortuneService;
	    }*/
	
	/*It is construtor-dependecy injection using annotation
	 * @Autowired
	TennisCoach(FortuneService fortuneService ){
		this.fortuneService = fortuneService;
	}
	*/
	
	//Setter-dependency injection using annotation
/*	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("\nTennisCoach : setFortuneService method");
		this.fortuneService = fortuneService;
	}*/
	
	//method injection autowire will work irrespective of method of names
/*	@Autowired
	public void doMethodinjection(FortuneService fortuneService) {
		System.out.println("\nTennisCoach : doMethodinjection method");
		this.fortuneService = fortuneService;
	}
	*/
	
	//create init method
	@PostConstruct
	public void init() {
		System.out.println("TennisCoach : inside the init method ");
	}
	
	//create destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("TennisCoach : inside the destroy method ");
	}
	
	
	@Override
	public String getDailyWorkOut() {		
		return "Tennis Workout is good for health";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
	}

	
	
}
