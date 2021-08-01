package com.ac.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SuvMaintenance implements EngineMaintenance {

	@Override
	public String getEngineMaintenanceDate() {
		return "Your oil change is due in 10000 miles - method called in SuvMaintenance";
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "SUV mileage = 80000";
	}

}
