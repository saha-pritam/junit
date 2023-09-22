package org.pritam.testing.alternativeToVerify;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;

import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

import org.junit.Test;
import org.pritam.testing.business.TodoBusinessImpl;
import org.pritam.testing.data.api.TodoService;

public class VerifyMethodCalls {

	@Test
	public void test1() {
		//Given
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		then(todoService).should().deleteTodo("Learn To Dance");
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
		then(todoService).should().deleteTodo("Learn Spring");
	}

}
