package com.Luv2Code.SpringDemo;

public class Hockey implements Coach {
	
	HappyFortuneService fortuneservice;
	
	

	public void setFortuneservice(HappyFortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise for 1 hout";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
