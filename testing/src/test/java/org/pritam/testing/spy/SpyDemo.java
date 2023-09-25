package org.pritam.testing.spy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyDemo {

	@Test
	public void test1() {
		List l = mock(ArrayList.class);
		given(l.size()).willReturn(10);
		l.add("Pritam");
		System.out.println("Mock object :- "+l);
		assertEquals(10,l.size());
	}
	
	@Test
	public void test2() {
		List l = spy(ArrayList.class);
		given(l.size()).willReturn(10);
		l.add("Saha");
		System.out.println("Spy object :- "+l);
		assertEquals(10,l.size());
	}

}
