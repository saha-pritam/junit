package org.pritam.testing.business;

import java.util.Arrays;
import java.util.List;

import org.pritam.testing.data.api.TodoService;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		List<String> list = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance");
		return list;
	}

	@Override
	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub

	}

}
