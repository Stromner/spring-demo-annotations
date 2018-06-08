package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "SwimCoach: 5 laps of breast stroke, 2 laps of mixed";
	}

}
