package org.pritam.testing.toBDD;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import org.mockito.BDDMockito;

import java.util.List;

import org.junit.Test;

public class ArgumentMatcher {
	//Given
	private List list = mock(List.class);
	
	@Test
	public void test() {
		//Given
		BDDMockito.given(list.contains(anyInt())).willReturn(true);
		BDDMockito.given(list.contains(anyDouble())).willReturn(true);
		BDDMockito.given(list.contains(anyString())).willReturn(false);
		
		//When
		boolean listContainInteger=list.contains(10);
		boolean listContainDouble=list.contains(12.15);
		boolean listContainString=list.contains("Pritam");
		
		//Then
		assertTrue(listContainInteger);
		assertTrue(listContainDouble);
		assertFalse(listContainString);
	}

}
