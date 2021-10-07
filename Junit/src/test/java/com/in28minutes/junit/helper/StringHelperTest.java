package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void truncateAInFirst2Positions_AinFirst2Position() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void test2truncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

		
		
	}

}
