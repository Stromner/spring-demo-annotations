package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void postInit() {
		System.out.println(">>TennishCoach inside postInit");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(">>TennisCoach inside preDestroy");
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
