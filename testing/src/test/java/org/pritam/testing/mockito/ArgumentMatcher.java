package org.pritam.testing.mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ArgumentMatcher {
	private List list = mock(List.class);
	
	@Test
	public void test() {
		when(list.contains(anyInt())).thenReturn(true);
		when(list.contains(anyDouble())).thenReturn(true);
		when(list.contains(anyString())).thenReturn(false);
		assertTrue(list.contains(10));
		assertTrue(list.contains(12.15));
		assertFalse(list.contains("Pritam"));
	}

}
