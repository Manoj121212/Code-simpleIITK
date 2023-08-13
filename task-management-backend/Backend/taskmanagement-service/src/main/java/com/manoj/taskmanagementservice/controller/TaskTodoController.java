package com.manoj.taskmanagementservice.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.taskmanagementservice.entity.TaskTodo;
import com.manoj.taskmanagementservice.repository.TaskTodoRepository;
import com.manoj.taskmanagementservice.service.TaskTodoService;



@RestController
//@RequestMapping("/users")
public class TaskTodoController {
		private TaskTodoService todoService;
		
		private TaskTodoRepository todoRepository;
		
		public TaskTodoController(TaskTodoService todoService, TaskTodoRepository todoRepository) {
			this.todoService = todoService;
			this.todoRepository = todoRepository;
		}
		
		@GetMapping("/users/{username}/todos")
		public List<TaskTodo> retrieveTodos(@PathVariable String username) {
			//return todoService.findByUsername(username);
			return todoRepository.findByUsername(username);
		}

		@GetMapping("/users/{username}/todos/{id}")
		public TaskTodo retrieveTodo(@PathVariable String username,
				@PathVariable int id) {
			//return todoService.findById(id);
			return todoRepository.findById(id).get();
		}

		@DeleteMapping("/users/{username}/todos/{id}")
		public ResponseEntity<Void> deleteTodo(@PathVariable String username,
				@PathVariable int id) {
			//todoService.deleteById(id);
			todoRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}

		@PutMapping("/users/{username}/todos/{id}")
		public TaskTodo updateTodo(@PathVariable String username,
				@PathVariable int id, @RequestBody TaskTodo todo) {
			//todoService.updateTodo(todo);
			todoRepository.save(todo);
			return todo;
		}

		@PostMapping("/users/{username}/todos")
		public TaskTodo createTodo(@PathVariable String username,
				 @RequestBody TaskTodo todo) {
			todo.setUsername(username);
			todo.setId(null);
			return todoRepository.save(todo);
//			Todo createdTodo = todoService.addTodo(username, todo.getDescription(), 
//					todo.getTargetDate(),todo.isDone() );
			
//			return createdTodo;
		}

	}

