package org.pritam.testing.argumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.pritam.testing.business.TodoBusinessImpl;
import org.pritam.testing.data.api.TodoService;

public class MultipleArgumentCaptor {

	@Test
	public void test() {
		//Given
		ArgumentCaptor<String> agc = ArgumentCaptor.forClass(String.class);
		TodoService todoService = mock(TodoService.class);
		given(todoService.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance","Learn To Code"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Pritam");
		
		//Then
		then(todoService).should(atLeast(1)).deleteTodo(agc.capture());
		assertEquals("Learn To Dance", agc.getAllValues().get(0));
		assertEquals("Learn To Code", agc.getAllValues().get(1));
	}
}
