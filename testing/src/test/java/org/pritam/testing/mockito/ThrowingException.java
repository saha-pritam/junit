package org.pritam.testing.mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ThrowingException {
	
	private List list = mock(List.class);

	@Test(expected = ArithmeticException.class)
	public void test1() {
		when(list.contains(anyInt())).thenThrow(new ArithmeticException());
		list.contains(10);
	}
	
	@Test(expected = NullPointerException.class)
	public void test2() {
		when(list.contains(anyString())).thenThrow(new NullPointerException());
		list.contains("Pritam");
	}
	
	@Test(expected = NumberFormatException.class)
	public void test3() {
		when(list.contains(anyDouble())).thenThrow(new NumberFormatException());
		list.contains(10.12);
	}

}
