package com.code.springdemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyLoggerConfig {

	private String rootLevelLogging;
	private String printedLevelLogging;
	
	
	public String getRootLevelLogging() {
		return rootLevelLogging;
	}
	public void setRootLevelLogging(String rootLevelLogging) {
		this.rootLevelLogging = rootLevelLogging;
	}
	public String getPrintedLevelLogging() {
		return printedLevelLogging;
	}
	public void setPrintedLevelLogging(String printedLevelLogging) {
		this.printedLevelLogging = printedLevelLogging;
	}
	
	
	public void myinitLogger(){
		
		Level rootLevel = Level.parse(rootLevelLogging);
		Level printLevel = Level.parse(printedLevelLogging);
		
		//get logger for application context
		
		Logger applicationContextLogger = Logger.getLogger(ClassPathXmlApplicationContext.class.getName());
		
		// get parent logger
				Logger loggerParent = applicationContextLogger.getParent();

				// set root logging level
				loggerParent.setLevel(rootLevel);
				
				// set up console handler
				ConsoleHandler consoleHandler = new ConsoleHandler();
				consoleHandler.setLevel(printLevel);
				consoleHandler.setFormatter(new SimpleFormatter());
				
				// add handler to the logger
				loggerParent.addHandler(consoleHandler);

	}
	
}
