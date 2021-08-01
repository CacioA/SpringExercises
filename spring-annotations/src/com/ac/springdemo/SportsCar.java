package com.ac.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsCar implements Car {

	private SportsCarMaintenance carMaintenance;
	
	@Autowired
	public SportsCar(SportsCarMaintenance carMaintenance) {
		this.carMaintenance = carMaintenance;
		System.out.println("-> Autowired constructor SportsCar");
	}
	// created a no arg constructor to test the @Autowired function
	// @Autowired is not needed when there is only one constructor since Spring 4.3
	public SportsCar() {
		
	}
	
	@Override
	public String startCar() {
		
		return "Press clutch and turn the igniton on.";
	}

	@Override
	public String getEngineMaintenance() {
		
		return carMaintenance.getEngineMaintenanceDate();
	}

	@Override
	public String getMileage() {

		return carMaintenance.getMileage();
	}
	
	


	

}
