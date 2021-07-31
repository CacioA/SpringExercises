package com.ac.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsCarMethodInj implements Car {

	
	private CarMaintenance carMaintenance;
	// default constructor
	public SportsCarMethodInj() {
		System.out.println("-> SportsCarMethodInj constructor");
	}
	
	// method injection
	@Autowired
	public void testingMethodInjection(CarMaintenance carMaintenance) {
		this.carMaintenance = carMaintenance;
		System.out.println("Inside methodInj ->"+carMaintenance.getEngineMaintenanceDate());
		
	}
	
	@Override
	public String startCar() {
	
		return null;
	}

	@Override
	public String getEngineMaintenance() {
		
		return "5000";
	}

	@Override
	public int getMileage() {
		
		return 10;
	}

}
