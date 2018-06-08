package com.luv2code.springdemo.demos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SwimCoach;

public class AnnotationsDemoApp {
	public static void main(String[] args) {
		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// Get the bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getPrivateData());
		
		// Close the context
		context.close();
	}
}
