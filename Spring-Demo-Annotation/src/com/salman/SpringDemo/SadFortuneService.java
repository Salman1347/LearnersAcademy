package com.salman.SpringDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "no day is sad";
	}

}

