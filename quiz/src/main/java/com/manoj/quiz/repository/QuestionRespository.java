package com.manoj.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoj.quiz.entity.Question;

@Repository
public interface  QuestionRespository  extends JpaRepository<Question,Long>{

	List<Question> findByCatagory(String catg);
	
	List<Question> findBySubCatagory(String subcatg);
	
	//@EntityGraph(attributePaths = {"id", "username"})

}

