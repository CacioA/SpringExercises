package com.ac.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from container
		
		
		// constructor injection class
		
		//using default beanID - class name with first letter as lowercase
		Car car = context.getBean("sportsCar",SportsCar.class);
		
		System.out.println(car.startCar());
		
		// call methods to get maintenance
		
		System.out.println("Constructor injection ->"+car.getEngineMaintenance());
		System.out.println("Constructor injection ->"+car.getMileage());
		
		
		// setter injection class
		
		Car carSetterInj=context.getBean("sportsCarSetterInj",SportsCarSetterInj.class);
		
		System.out.println("Setter injection ->"+carSetterInj.getEngineMaintenance());
		System.out.println("Setter injection ->"+carSetterInj.getMileage());
		
		
		
		//close container
		context.close();
	}

}
