package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void postInit() {
		System.out.println("Custom post init method running");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Custom pre destroy method running");
	}
	
	/*@Autowired // Will look for a class that implements the FortuneService interface
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: Inside setFortuneService");
		this.fortuneService = fortuneService;
	}*/
	
	/*
	@Autowired
	public void notASetterMethod(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: Inside notASetterMethod");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Play 10 sets";
	}
	
	@Override
	public String getDailyFortune() {
		return "TennisCoach: " + fortuneService.getFortune();
	}
}
