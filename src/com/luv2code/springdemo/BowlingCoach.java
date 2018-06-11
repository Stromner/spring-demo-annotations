package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BowlingCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public BowlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout? Ha!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getPrivateData() {
		return "BowlingCoach: email="+email+"\tteam="+team;
	}
}
