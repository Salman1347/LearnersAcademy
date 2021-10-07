package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	
	
	@Test
	public void test2() {
		
		int[] numbers = {12,3,4,1};
		
		int [] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected,numbers);
		
	}

}
