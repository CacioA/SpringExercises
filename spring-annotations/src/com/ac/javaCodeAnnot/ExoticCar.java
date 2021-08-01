package com.ac.javaCodeAnnot;

import org.springframework.beans.factory.annotation.Value;

public class ExoticCar implements Car {

	private ExoticCarMaintenance exoticCarMaintenance;
	
	@Value("${exoticCar.brand}")
	public String carBrand;
	
	public ExoticCar(ExoticCarMaintenance exoticCarMaintenance) {
		this.exoticCarMaintenance=exoticCarMaintenance;
		}
	
	@Override
	public String startCar() {
		return "Put in park and press the start button";
	}

	@Override
	public String stopCar() {
		
		return "Put in park and press the stop button";
	}

	@Override
	public String getOilMaintenance() {
	
			return exoticCarMaintenance.oilMaintenance();
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	

}
