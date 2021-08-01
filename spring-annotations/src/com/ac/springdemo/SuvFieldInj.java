package com.ac.springdemo;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SuvFieldInj implements Car {

	
	@Autowired
	@Qualifier("suvMaintenance")
	private EngineMaintenance carMaintenance;
	
	@PreDestroy 
	public void destroyMethod(){
		System.out.println("-> Inside PreDestroy method - Put in park and turn engine off.");
	}
	
	@Override
	public String startCar() {
	
		return "Put in park and start the engine";
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
