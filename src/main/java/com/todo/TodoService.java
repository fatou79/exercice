package com.todo;

import java.util.ArrayList;

public class TodoService {
	private static ArrayList todos = new ArrayList();
	static {
		
		todos.add(new Todo("laila professor", "teaching"));
		todos.add(new Todo("fatou student", "education"));
		todos.add(new Todo("sounkoun, ringmaster","orders"));
		
	}
	

}
