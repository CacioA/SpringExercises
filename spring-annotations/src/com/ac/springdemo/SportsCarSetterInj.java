package com.ac.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsCarSetterInj implements Car {


	private CarMaintenance carMaintenance;
	
	public SportsCarSetterInj() {
		
	}
	@Autowired
	public void setCarMaintenance(CarMaintenance carMaintenance) {
		this.carMaintenance = carMaintenance;
	}
	@Override
	public String startCar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEngineMaintenance() {
		return carMaintenance.getEngineMaintenanceDate();
	}

	@Override
	public int getMileage() {
		return 10250;
		// hard coded value to compare to value from above which is taken from carMaintenance
	}

}
