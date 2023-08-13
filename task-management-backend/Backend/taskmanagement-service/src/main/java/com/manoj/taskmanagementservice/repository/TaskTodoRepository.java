package com.manoj.taskmanagementservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoj.taskmanagementservice.entity.TaskTodo;


@Repository 
public interface TaskTodoRepository extends JpaRepository<TaskTodo, Integer>{
	
	List<TaskTodo> findByUsername(String username);
	
	
	

}


