package org.pritam.testing.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class DynamicValuesOnEachCall {

	@Test
	public void test1() {
		List list = mock(List.class);
		when(list.size()).thenReturn(1).thenReturn(2).thenReturn(3);
		assertEquals(1,list.size());
		assertEquals(2,list.size());
		assertEquals(3,list.size());
	}
	
	@Test
	public void test2() {
		List list = mock(List.class);
		when(list.size()).thenReturn(1, 2, 3, 4);
		assertEquals(1,list.size());
		assertEquals(2,list.size());
		assertEquals(3,list.size());
		assertEquals(4,list.size());
	}

}
