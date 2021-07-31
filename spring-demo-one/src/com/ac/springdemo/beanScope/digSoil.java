package com.ac.springdemo.beanScope;

public class digSoil implements digInterface {

	@Override
	public String showTools() {
		return "No tools available";
	}

	@Override
	public int staffNumber() {
		return 10;
	}
	
	public void digSoilInit() {
		
		System.out.println("Power tools on");
	}

	public void coverUpHole() {
		
		System.out.println("Fill the hole with soil and cover up");
	}
}



