package com.luv2code.springdemo.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SportConfig;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		// Read Spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		// Get the bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}
