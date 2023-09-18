package org.pritam.testing.helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpringHelperTest {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame1() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame2() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame3() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame4() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AACDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame5() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ACDA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame6() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame(""));
	}

}
