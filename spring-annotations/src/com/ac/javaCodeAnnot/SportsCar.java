package com.ac.javaCodeAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportsCar implements Car {
	
	private Maintenance carMaintenance;
	
	@Value("${sportsCar.brand}")
	private String carBrand;
	
	
	public SportsCar(Maintenance carMaintenance) {
		this.carMaintenance=carMaintenance;
	}

	@Override
	public String startCar() {
		return "Push clutch and start engine";
	}

	@Override
	public String stopCar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getOilMaintenance() {
		return carMaintenance.oilMaintenance();
	}
	
	public String getCarBrand() {
		return carBrand;
	}

}
