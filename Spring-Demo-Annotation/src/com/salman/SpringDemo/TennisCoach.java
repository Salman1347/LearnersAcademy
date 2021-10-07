package com.salman.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("happyFortuneService")
	private HappyFortuneService service;
	
	
	
	


	@Override
	public String getDailyWorkout() {
		
		return "practise for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}

}
