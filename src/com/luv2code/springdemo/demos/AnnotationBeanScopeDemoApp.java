package com.luv2code.springdemo.demos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theBadCoach = context.getBean("tennisCoach", Coach.class);
		
		// do stuff
		System.out.println("theCoach ref: " + theCoach);
		System.out.println("theBadCoach ref: " + theBadCoach);
		System.out.println("theCoach==theBadCoach? " + (theCoach==theBadCoach));
		
		// close context file
		context.close();
	}
}
