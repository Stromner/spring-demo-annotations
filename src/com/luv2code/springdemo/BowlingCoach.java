package com.luv2code.springdemo;

public class BowlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
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

}
