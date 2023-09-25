package org.pritam.testing.mockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.pritam.testing.business.TodoBusinessImpl;
import org.pritam.testing.data.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplTestingWithMockitoAnnotation {
	
	@Mock
	private TodoService todoService;
	
	@InjectMocks
	private TodoBusinessImpl todoBusinessImpl;

	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_1() {
		given(todoService.retrieveTodos("Pritam")).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		assertEquals(2, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_2() {
		given(todoService.retrieveTodos("Pritam")).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		String arr[] = {"Learn Spring MVC","Learn Spring"};
		assertArrayEquals(arr, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").toArray());
	}

}
