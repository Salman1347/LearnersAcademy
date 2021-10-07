package com.Luv2Code.SpringDemo;

public class BaseballCoach implements Coach {
	
	HappyFortuneService fortuneservice;
	
	

	public BaseballCoach(HappyFortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}

	public String getDailyWorkout() {
		
		return "spend 30 mins on batting practise";
		
	}

	@Override
	public String getDailyFortunes() {
		
		return fortuneservice.getFortune();
	}
}
