package com.ac.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CarMaintenance implements EngineMaintenance {

	@Override
	public String getEngineMaintenanceDate() {
		return "Your oil change is due in 2000 miles";
	}

	@Override
	public int getMileage() {
		return 15000;
	}

}
