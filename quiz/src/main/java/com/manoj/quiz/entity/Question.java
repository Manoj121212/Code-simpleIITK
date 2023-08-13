package com.manoj.quiz.entity;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="QuestionID")
	private long questionId;
	private String questionContent;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;
	@Column(nullable=false)
	private String catagory;
	@Column(nullable=false)
	private String subCatagory;
	
	public Question() {
		super();
	}

	
	public Question(long questionId, String questionContent, String option1, String option2, String option3,
			String option4, String answer, String catagory, String subCatagory) {
		super();
		this.questionId = questionId;
		this.questionContent = questionContent;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.catagory = catagory;
		this.subCatagory = subCatagory;
	}


	public long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}


	public String getQuestionContent() {
		return questionContent;
	}


	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}


	public String getOption1() {
		return option1;
	}


	public void setOption1(String option1) {
		this.option1 = option1;
	}


	public String getOption2() {
		return option2;
	}


	public void setOption2(String option2) {
		this.option2 = option2;
	}


	public String getOption3() {
		return option3;
	}


	public void setOption3(String option3) {
		this.option3 = option3;
	}


	public String getOption4() {
		return option4;
	}


	public void setOption4(String option4) {
		this.option4 = option4;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getCatagory() {
		return catagory;
	}


	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}


	public String getSubCatagory() {
		return subCatagory;
	}


	public void setSubCatagory(String subCatagory) {
		this.subCatagory = subCatagory;
	}


	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionContent=" + questionContent + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", answer=" + answer
				+ ", catagory=" + catagory + ", subCatagory=" + subCatagory + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(answer, catagory, option1, option2, option3, option4, questionContent, questionId,
				subCatagory);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(catagory, other.catagory)
				&& Objects.equals(option1, other.option1) && Objects.equals(option2, other.option2)
				&& Objects.equals(option3, other.option3) && Objects.equals(option4, other.option4)
				&& Objects.equals(questionContent, other.questionContent) && questionId == other.questionId
				&& Objects.equals(subCatagory, other.subCatagory);
	}

}
	


	
