package org.pritam.testing.toBDD;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import org.mockito.BDDMockito;

import java.util.List;

import org.junit.Test;

public class DynamicValuesOnEachCall {

	@Test
	public void test1() {
		//Given
		List list = mock(List.class);
		BDDMockito.given(list.size()).willReturn(1).willReturn(2).willReturn(3);
		
		//When
		int size1 = list.size();
		int size2 = list.size();
		int size3 = list.size();
		
		//Then
		assertEquals(1,size1);
		assertEquals(2,size2);
		assertEquals(3,size3);
	}
	
	@Test
	public void test2() {
		//Given
		List list = mock(List.class);
		BDDMockito.given(list.size()).willReturn(1, 2, 3, 4);
		
		//When
		int size1 = list.size();
		int size2 = list.size();
		int size3 = list.size();
		int size4 = list.size();
		
		//Then
		assertEquals(1,size1);
		assertEquals(2,size2);
		assertEquals(3,size3);
		assertEquals(4,size4);
	}

}
