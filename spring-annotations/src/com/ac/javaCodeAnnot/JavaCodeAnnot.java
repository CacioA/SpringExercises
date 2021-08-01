package com.ac.javaCodeAnnot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeAnnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CodeConfig.class);
		// Only Java Code Annotation
		SportsCar sportsCar = context.getBean("sportsCar",SportsCar.class);
		ExoticCar exoticCar = context.getBean("exoticCar",ExoticCar.class);
		
		System.out.println(sportsCar.startCar());
		System.out.println(sportsCar.getOilMaintenance());
		System.out.println("Car brand: "+sportsCar.getCarBrand());
		System.out.println("-------------");
		System.out.println("-------------");
		
		System.out.println(exoticCar.startCar());
		System.out.println(exoticCar.getOilMaintenance());
		System.out.println("Car brand: "+exoticCar.getCarBrand());
		context.close();
	}

}
