package com.Luv2Code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retriev the bean from spring container
		Coach coach = context.getBean("myHockeycoach", Hockey.class);
		
		
		//call methods on the bean 
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortunes());
		
		
		//close the context
		context.close();
		
	}
	
	

}
