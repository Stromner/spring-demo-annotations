package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired // Will look for a class that implements the FortuneService interface
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Play 10 sets";
	}
	
	@Override
	public String getDailyFortune() {
		return "TennisCoach: " + fortuneService.getFortune();
	}
}
