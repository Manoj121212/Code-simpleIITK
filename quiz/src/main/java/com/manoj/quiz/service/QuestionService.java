package com.manoj.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.quiz.entity.Question;
import com.manoj.quiz.repository.QuestionRespository;

@Service
public class QuestionService {
	@Autowired
	QuestionRespository questionRepository;
;

	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
		
		
	}
	public List<Question> getQuestionsByCatagory(String catg) {
		
		return questionRepository.findByCatagory(catg) ;
	}

public List<Question> getQuestionsBySubCatagory(String subcat) {
		List<Question> lst= questionRepository.findBySubCatagory(subcat) ;
//		List<Question> list2= lst.stream().
//			filter(question->question.getSubCatagory().
//			equalsIgnoreCase(catg)).toList();
//			
//	return list2;
		return lst;
}
}
