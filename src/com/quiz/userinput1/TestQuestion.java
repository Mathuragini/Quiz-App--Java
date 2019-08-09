package com.quiz.userinput1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestQuestion {

	public static void main(String[] args) {
		// Create Array list for the QuestionList
		List<Question> questionList = new ArrayList<Question>();

		// Create object for the Question Class and add question and questionNo
		Question question1 = new Question(1, " What is the color of Mango?");
		Question question2 = new Question(2, " How many fingers do you have ?");

		// Set the choices for the above question
		question1.setChoices("Red", "Green", "Yellow", "Black", "Blue");
		question2.setChoices("Two", "Ten", "Five", "One", "Twenty");

		// Set the correct answer for the question
		question1.setCorrectAnswer(3);
		question2.setCorrectAnswer(5);

		// Add the question to the questionList
		questionList.add(question1);
		questionList.add(question2);

		// Print the question and answers from the user input
		Scanner scanner = new Scanner(System.in);
		int correctAnswer = 0;
		for (Question ques : questionList) {
			System.out.print("Ques" + ques.getQuestioNumber() + "." + ques.getQuestion());

			Map<Integer, String> choices = ques.getChoices();

			for (Map.Entry<Integer, String> entry : choices.entrySet()) {

				System.out.println("\n" + "......" + entry.getKey() + ". " + entry.getValue());
			}
			Integer answer = scanner.nextInt();

			if (ques.getCorrectAnswer() == answer) {
				System.out.println("Answer is correct");
				correctAnswer++;
			} else {
				System.out.println("Answer is Wrong");
			}
		}

		//Print the mark
		System.out.println("Total correct Answer :" + correctAnswer + "/of" + questionList.size());
	}
}
