package com.ac.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

public static void main(String[] args) {
		
	// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		// call methods on bean(s)
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		// close container(context)
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println("Cricket Coach says:"+cricketCoach.getDailyFortune());
		System.out.println("Cricket Coach workout: "+cricketCoach.getDailyWorkout());
		
	   System.out.println("Cricket Coach team:"+cricketCoach.getTeam());
	   System.out.println("Cricket Coach emial:"+cricketCoach.getEmailAddress());
		
		context.close();

	}

}
