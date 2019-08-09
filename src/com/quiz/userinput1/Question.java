package com.quiz.userinput1;

import java.util.HashMap;
import java.util.Map;

public class Question {

	private Integer questioNumber;
	private String question;
	private Map<Integer, String> choices;
	private Integer correctAnswer;

	// Generate getters
	public Integer getQuestioNumber() {
		return questioNumber;
	}

	public String getQuestion() {
		return question;
	}

	public Map<Integer, String> getChoices() {
		return choices;
	}

	public Integer getCorrectAnswer() {
		return correctAnswer;
	}

	// Generate constructor
	public Question(Integer questioNumber, String question) {
		super();
		this.questioNumber = questioNumber;
		this.question = question;
	}

	// Set the choices for the answer
	public void setChoices(String... string) {
		Integer i = 1;
		choices = new HashMap<Integer, String>();
		for (String str : string) {
			this.choices.put(i, str);
			i++;
		}

	}

	// Set the correct answer for the question
	public void setCorrectAnswer(Integer correctAnswer) {
		this.correctAnswer = correctAnswer;

	}

	@Override
	public String toString() {
		return "Question [questioNumber=" + questioNumber + ", question=" + question + ", choices=" + choices
				+ ", correctAnswer=" + correctAnswer + "]";
	}

}
