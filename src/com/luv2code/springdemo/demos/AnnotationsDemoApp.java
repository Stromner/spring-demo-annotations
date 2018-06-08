package com.luv2code.springdemo.demos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class AnnotationsDemoApp {
	public static void main(String[] args) {
		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// Get the bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}
}
