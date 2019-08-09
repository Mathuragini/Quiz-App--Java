package com.quiz.userinput2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
		while (true) {
			clearScreen();
			System.out.println("Press M for Menu");
			String user = scanner.nextLine();

			switch (user.toUpperCase()) {
			case "A":
				System.out.println("Now you are admin");

				System.out.println("Please Enter the question No :");
				Integer qno = scanner.nextInt();

				System.out.println("Please Enter the question :");
				String qus = scanner.nextLine();

				Question questions = new Question(qno, qus);
				questionList.add(questions);

				break;
			case "U":
				showQuestions(questionList, scanner);
				break;
			case "M":
				System.out.println("Please choose the user \n A.ADMIN \n U.USER \n Q.QUIT");
				break;
			case "Q":
				System.exit(0);

			default:
				System.out.print("Bad operation , choose A /U /Q");
			}

		}

	}

	public static void clearScreen() {
		System.out.flush();
	}

	public static void showQuestions(List<Question> questionList, Scanner scanner) {
		// user answers
		Map<Question, Integer> answerMap = new LinkedHashMap<Question, Integer>();
		// Map<Question, Integer> answerMap = new HashMap<Question, Integer>();

		for (Question ques : questionList) {
			System.out.print("Ques" + ques.getQuestioNumber() + "." + ques.getQuestion());

			Map<Integer, String> choices = ques.getChoices();

			for (Map.Entry<Integer, String> entry : choices.entrySet()) {

				System.out.println("\n" + "......" + entry.getKey() + ". " + entry.getValue());
			}
			Integer answer = scanner.nextInt();

			answerMap.put(ques, answer);

		}

		// Print the mark

		System.out.println("Question No : \t Answer No:");

		for (Map.Entry<Question, Integer> answer : answerMap.entrySet()) {

			boolean ansStatus = false;
			if (answer.getKey().getCorrectAnswer() == answer.getValue()) {
				ansStatus = true;
			}
			System.out.println(answer.getKey().getQuestioNumber() + " \t\t" + answer.getValue());
		}
		// System.out.println("Total correct Answer :" + answerMap + "/of" +
		// questionList.size());
	}
}