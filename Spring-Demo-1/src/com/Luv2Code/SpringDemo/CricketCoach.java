package com.Luv2Code.SpringDemo;

public class CricketCoach implements Coach {
	
HappyFortuneService fortuneservice;
	
	

	public CricketCoach(HappyFortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}


	@Override
	public String getDailyWorkout() {
		
		return "go to pitch" ;
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
