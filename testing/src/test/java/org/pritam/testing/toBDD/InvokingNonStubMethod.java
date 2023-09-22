package org.pritam.testing.toBDD;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

public class InvokingNonStubMethod {

	//Given
	private List list = mock(List.class);
	
	@Test
	public void test1() {
		//When
		int size = list.size();
		//Then
		assertEquals(0,size);
	}
	
	@Test
	public void test2() {
		//When
		Object object = list.get(0);
		//Then
		assertEquals(null,object);
	}

}
