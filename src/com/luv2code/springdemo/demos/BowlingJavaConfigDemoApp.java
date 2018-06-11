package com.luv2code.springdemo.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.BowlingCoach;
import com.luv2code.springdemo.SportConfig;

public class BowlingJavaConfigDemoApp {
	public static void main(String[] args) {
		// Read Spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		// Get the bean from Spring container
		BowlingCoach theCoach = context.getBean("bowlingCoach", BowlingCoach.class);
		
		// Call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getPrivateData());
		
		// Close the context
		context.close();
	}
}
