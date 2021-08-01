package com.ac.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuvFieldInj implements Car {

	@Autowired
	private CarMaintenance carMaintenance;
	
	@Override
	public String startCar() {
	
		return "Put in park and start the engine";
	}

	@Override
	public String getEngineMaintenance() {
		return carMaintenance.getEngineMaintenanceDate();
	}

	@Override
	public int getMileage() {
		return 85000;
	}

}
