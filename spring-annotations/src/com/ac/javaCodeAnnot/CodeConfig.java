package com.ac.javaCodeAnnot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:maintenance.properties")
@ComponentScan("com.ac.javaCodeAnnot")
public class CodeConfig {

		
	@Bean
	
	public Maintenance sportsCarMaintenance() {
		return new SportsCarMaintenance();
	}
	@Bean 
	public Car sportsCar() {
		return new SportsCar(sportsCarMaintenance());
		 
	}
	
	@Bean
	public ExoticCarMaintenance exoticCarMaintenance(){
		return new ExoticCarMaintenance();
	}
	
	@Bean 
	public Car exoticCar() {
		return new ExoticCar(exoticCarMaintenance());
		 
	}
	
	
}
