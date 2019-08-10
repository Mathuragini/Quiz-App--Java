package com.quiz.defaultans;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion {

	public static void main(String[] args) {
		//Create Array list for the QuestionList
		List <Question> questionList = new ArrayList<Question>();
		
		//Create object for the Question Class and add question and questionNo
		Question question = new Question(1," What is the color of Mango?");
		Question question1 = new Question(1," What is the color of sky?");
		
		//Set the choices for the above question
		question.setChoices("Red","Green","Yellow","Black","Blue");
		question1.setChoices("Red","Green","Yellow","Black","Blue");
		
		//Set the correct answer for the question
		question.setCorrectAnswer(3);
		question1.setCorrectAnswer(5);
		
		//Add the question to the questionList
		questionList.add(question);
		questionList.add(question1);
		
		//Print the question and answers
		for(Question ques :questionList ) {
			System.out.println(ques);
		}

	}

}
