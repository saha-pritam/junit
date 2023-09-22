package org.pritam.testing.argumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.pritam.testing.business.TodoBusinessImpl;
import org.pritam.testing.data.api.TodoService;

public class SingleArgumentCaptor {

	@Test
	public void test1() {
		//Given
		ArgumentCaptor<String> agc = ArgumentCaptor.forClass(String.class);
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		then(todoService).should().deleteTodo(agc.capture());
		assertEquals("Learn To Dance", agc.getValue());
		
	}
	
	@Test
	public void test2() {
		//Given
		ArgumentCaptor<String> agc = ArgumentCaptor.forClass(String.class);
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		then(todoService).should().deleteTodo(agc.capture());
		assertEquals("Learn To Dance", agc.getValue());
		
	}

}
