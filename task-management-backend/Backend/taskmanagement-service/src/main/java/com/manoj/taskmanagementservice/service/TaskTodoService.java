package com.manoj.taskmanagementservice.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Service;

import com.manoj.taskmanagementservice.entity.TaskTodo;


	@Service
	public class TaskTodoService {
		
		private static List<TaskTodo> todos = new ArrayList<>();
		
		private static int todosCount = 0;
		
		static {
			todos.add(new TaskTodo(++todosCount, "manoj@restApi","Get AWS Certified", 
								LocalDate.now().plusYears(10), false ));
			todos.add(new TaskTodo(++todosCount, "manoj@restApi","Learn DevOps", 
					LocalDate.now().plusYears(11), false ));
			todos.add(new TaskTodo(++todosCount, "manoj@restApi","REST API Development", 
					LocalDate.now().plusYears(0), true ));
		}
		
		public List<TaskTodo> findByUsername(String username){
			Predicate<? super TaskTodo> predicate = 
					todo -> todo.getUsername().equalsIgnoreCase(username);
			return todos.stream().filter(predicate).toList();
		}
		
		public TaskTodo addTodo(String username, String description, LocalDate targetDate, boolean done) {
			TaskTodo todo = new TaskTodo(++todosCount,username,description,targetDate,done);
			todos.add(todo);
			return todo;
		}
		
		public void deleteById(int id) {
			Predicate<? super TaskTodo> predicate = todo -> todo.getId() == id;
			todos.removeIf(predicate);
		}

		public TaskTodo findById(int id) {
			Predicate<? super TaskTodo> predicate = todo -> todo.getId() == id;
			TaskTodo todo = todos.stream().filter(predicate).findFirst().get();
			return todo;
		}

		public void updateTodo(TaskTodo todo) {
			deleteById(todo.getId());
			todos.add(todo);
		}
	}


