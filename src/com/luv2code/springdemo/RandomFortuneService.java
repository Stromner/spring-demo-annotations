package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	@Value("${fortunes.test}")
	private String[] fortunes;
	
	@Override
	public String getFortune() {
		Random random = new Random();
		return fortunes[random.nextInt(fortunes.length)];
	}

}
