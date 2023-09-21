package org.pritam.testing.business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.pritam.testing.data.api.TodoService;

public class TodoBusinessImplTesting {

	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_1() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		assertEquals(2, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_withStub_2() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		String arr[] = {"Learn Spring MVC","Learn Spring"};
		assertArrayEquals(arr, todoBusinessImpl.retrieveTodosRelatedToSpring("Pritam").toArray());
	}

}
