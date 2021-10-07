package com.Luv2Code.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Coach coach = context.getBean("mycoach", BaseballCoach.class);
		Coach alphacoach = context.getBean("mycoach", BaseballCoach.class);

		boolean result = (coach == alphacoach);
		
		System.out.println("pointing to the same object"+result);
		
		System.out.println("memory location" +coach);
		
		System.out.println("memory location" +alphacoach);
		
	}

}
