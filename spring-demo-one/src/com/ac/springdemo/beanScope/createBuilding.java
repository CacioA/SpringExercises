package com.ac.springdemo.beanScope;

public class createBuilding implements buildingBase {

	@Override
	public String buildingPlanned() {
		return "Building plan created";
	}
	
	public void doStartUp() {
		System.out.println("StartUp function called.");
	}
	
	public void doCleanUp() {
		System.out.println("CleanUp function called.");
	}

}
