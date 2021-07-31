package com.ac.springdemo;

public class BaseballCoach implements Coach{

	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "30 minutes batting practice";
	}
	
	
	@Override
	public String getDailyFortune() {
		
		// use fortuneService to get a fortune
		
		return fortuneService.getFortune(); 
	}
}
