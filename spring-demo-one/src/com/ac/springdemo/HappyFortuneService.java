package com.ac.springdemo;

public class HappyFortuneService implements FortuneService {

	
	
	@Override
	public String getFortune() {
		
		return "This is your happy day";
	}

}
