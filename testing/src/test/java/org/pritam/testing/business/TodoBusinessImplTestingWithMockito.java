package org.pritam.testing.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.pritam.testing.data.api.TodoService;

public class TodoBusinessImplTestingWithMockito {

	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_1() {
		TodoService todoService = mock(TodoService.class);
		when(todoService.retrieveTodos("Pritam")).thenReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		assertEquals(2, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_2() {
		TodoService todoService = mock(TodoService.class);
		when(todoService.retrieveTodos("Pritam")).thenReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		String arr[] = {"Learn Spring MVC","Learn Spring"};
		assertArrayEquals(arr, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").toArray());
	}

}
