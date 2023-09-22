package org.pritam.testing.mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import org.junit.Test;
import org.pritam.testing.business.TodoBusinessImpl;
import org.pritam.testing.data.api.TodoService;

public class NeverMethodDemo {

	@Test
	public void test1() {
		//Given
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		verify(todoService, never()).deleteTodo("Learn To Dance");
	}
	
	@Test
	public void test2() {
		//Given
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		verify(todoService, never()).deleteTodo("Learn Spring");
	}

}
