package com.ac.springdemo.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
	
	// create context
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScopeContext.xml");
	
	createBuilding building = context.getBean("createBuilding", createBuilding.class);
	
	System.out.println(building.buildingPlanned());
	
	createBuilding secondBuilding = context.getBean("createBuilding",createBuilding.class);
	
	// compare beans
	
	
	System.out.println("Are the two buildings pointing to the same bean: "+(building==secondBuilding));
	System.out.println("Building 1 memory address: "+building);
	System.out.println("Building 2 memory address: "+secondBuilding);
	
	digSoil soil = context.getBean("digSoil",digSoil.class);
	digSoil secondSoil = context.getBean("digSoil",digSoil.class);
	
	System.out.println("Are the two soils pointing to the same bean: "+(soil==secondSoil));
	System.out.println("Soil 1 memory address: "+soil);
	System.out.println("Soil 2 memory address: "+secondSoil);
	
	// close container
	context.close();
	}
}
