package org.pritam.testing.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpringHelperTest {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions1() {
		assertEquals("",stringHelper.truncateAInFirst2Positions("A"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("",stringHelper.truncateAInFirst2Positions("AA"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions3() {
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions4() {
		assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions5() {
		assertEquals("ACD",stringHelper.truncateAInFirst2Positions("AACD"));
	}

}
