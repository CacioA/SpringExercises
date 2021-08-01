package com.ac.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SportsCarSetterInj implements Car {


	private EngineMaintenance carMaintenance;
	
	//default constructor
	public SportsCarSetterInj() {
		System.out.println("-> No args SportsCarSetterInj constructor");
		
	}
	// setter injection
	@Autowired
	@Qualifier("sportsCarMaintenance")
	public void setCarMaintenance(EngineMaintenance carMaintenance) {
		this.carMaintenance = carMaintenance;
	}
	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return  "Press clutch and turn the igniton on.";
	}

	@Override
	public String getEngineMaintenance() {
		return carMaintenance.getEngineMaintenanceDate();
	}

	@Override
	public String getMileage() {
		return "10250";
		// hard coded value to compare to value from above which is taken from carMaintenance
	}

}
