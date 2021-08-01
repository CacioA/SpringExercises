package com.ac.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SportsCarMethodInj implements Car {

	
	private EngineMaintenance carMaintenance;
	// default constructor
	public SportsCarMethodInj() {
		System.out.println("-> SportsCarMethodInj constructor");
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("-> Inside PostConstrcut method - Open door and put the key in.");
	}
	
	
	
	// method injection
	@Autowired
	@Qualifier("sportsCarMaintenance")
	public void testingMethodInjection(EngineMaintenance carMaintenance) {
		this.carMaintenance = carMaintenance;
		System.out.println("Inside methodInj ->"+carMaintenance.getEngineMaintenanceDate());
		
	}
	
	@Override
	public String startCar() {
	
		return  "Press clutch and turn the igniton on.";
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
