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
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		System.out.println("Constructor injection ->"+car.getEngineMaintenance());
		System.out.println("Constructor injection ->"+car.getMileage());
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		// setter injection class
		
		SportsCarSetterInj carSetterInj=context.getBean("sportsCarSetterInj",SportsCarSetterInj.class);
		
		System.out.println("Setter injection ->"+carSetterInj.getEngineMaintenance());
		System.out.println("Setter injection ->"+carSetterInj.getMileage());
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		// method injection class

		SportsCarMethodInj carMethodInj = context.getBean("sportsCarMethodInj",SportsCarMethodInj.class);
		
		System.out.println("Method injection ->"+carMethodInj.getEngineMaintenance());
		System.out.println("Method injection ->"+carMethodInj.startCar());
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		SportsCarMethodInj secondCarMethodInj = context.getBean("sportsCarMethodInj",SportsCarMethodInj.class);
		
		System.out.println("Scope set to prototype. Comparing the two beans");
		System.out.println((carMethodInj==secondCarMethodInj));
		System.out.println("carMethodInj memory address:"+carMethodInj);
		System.out.println("secondCarMethodInj memory address:"+secondCarMethodInj);
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		// field injection class
		
		SuvFieldInj suvFieldInj = context.getBean("suvFieldInj",SuvFieldInj.class);
		
		System.out.println("Field injection ->"+suvFieldInj.getEngineMaintenance());
		System.out.println("Field injection ->"+suvFieldInj.getMileage());
		System.out.println("Field injection ->"+suvFieldInj.startCar());
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		//close container
		context.close();
	}

}
