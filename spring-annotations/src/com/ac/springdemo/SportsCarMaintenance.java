package com.ac.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SportsCarMaintenance implements EngineMaintenance {

	@Override
	public String getEngineMaintenanceDate() {
		return "Your oil change is due in 2000 miles - method caled in SportsCarMaintenance";
	}

	@Override
	public String getMileage() {
		return "Sports car mileage = 15000";
	}

}
