package org.pritam.testing.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

public class InvokingNonStubMethod {

	private List list = mock(List.class);
	
	@Test
	public void test1() {
		assertEquals(0,list.size());
	}
	
	@Test
	public void test2() {
		assertEquals(null,list.get(0));
	}

}
