package com.salman.SpringDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService service;
	
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	
	
	
	
	public FortuneService getService() {
		return service;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService service) {
		super();
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		
		return "swim 1000mtrs";
	}

	@Override
	public String getDailyFortune() {
		
		return service.getFortune();
	}

}
