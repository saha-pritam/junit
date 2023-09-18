package org.pritam.testing.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionTesting {

	@Test(expected = NullPointerException.class)
	public void test1() {
		//Test 1 will fail since it is expecting to get a null pointer exception but in actual it is having none.
	}
	
	@Test(expected = NullPointerException.class)
	public void test2() {
		String s=null;
		int l = s.length();
	}

}
