package com.ac.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Inside Setter email address");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Inside Setter team");
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		System.out.println("Inside Setter fortune service");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play cricket";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
