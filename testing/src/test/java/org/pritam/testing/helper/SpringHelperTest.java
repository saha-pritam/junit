package org.pritam.testing.helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpringHelperTest {

	StringHelper stringHelper = new StringHelper();
	
	@BeforeClass
	public static void atStartOfTesting() {
		System.out.println("Starting of testing.");
	}
	
	@AfterClass
	public static void atEndOfTesting() {
		System.out.println("Ending of testing.");
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame1() {
		System.out.println("This is test case 1.");
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame2() {
		System.out.println("This is test case 2.");
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame3() {
		System.out.println("This is test case 3.");
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame4() {
		System.out.println("This is test case 4.");
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AACDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame5() {
		System.out.println("This is test case 5.");
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ACDA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame6() {
		System.out.println("This is test case 6.");
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame(""));
	}

}
