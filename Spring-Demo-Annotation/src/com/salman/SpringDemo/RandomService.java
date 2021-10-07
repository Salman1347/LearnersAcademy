package com.salman.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "hellllllloooooooooo";
	}

}
