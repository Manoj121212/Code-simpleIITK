package com.manoj.quiz.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.quiz.entity.Question;
import com.manoj.quiz.service.QuestionService;


 
@RestController
@Controller
@RequestMapping("/question") 
public class QuestionController {
	@Autowired
	QuestionService questionservice;
	
	@RequestMapping("/allquestions")
	public List<Question> allQuestion() {
		return questionservice.getAllQuestions();
	}

//	@GetMapping("catagory/{catg}")
//	public List<Question> questionsByCatagory(@PathVariable String catg ) {
//		return questionservice.getQuestionsByCatagory(catg);
//	}
//	
//	@GetMapping("/{subcatg}")
//	public List<Question> questionsBySubCatagory(@PathVariable String subcatg) {
//		return questionservice.getQuestionsBySubCatagory(subcatg);
//	}
////	@GetMapping("/restService/{urlParameter}")
////	public Map<String,String> restService(@PathVariable("urlParameter") String urlParameter,@RequestParam("queryParameter") String queryParameter){
////	     
////	     
////	    Map<String,String> response = new HashMap<>();
////	     
////	    response.put("urlParameter", urlParameter);
////	     
//	    response.put("queryParameter",queryParameter);
//	     
//	     
//	    return response;
//	     
//	}
//	@GetMapping("subcatagory/{subcatg}")
//	public List<Question> questionsBySubCatagory(@PathVariable String subcatg) {
//		return questionservice.getQuestionsBySubCatagory(subcatg);
//	}
}
