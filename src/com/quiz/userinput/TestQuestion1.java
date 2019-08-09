package com.quiz.userinput;

import java.util.Scanner;

public class TestQuestion1 {

	public static void main(String[] args) {
		int song;
		int correctAnswers = 0;
		int wronganswers = 0;
		// scanner for input options
		Scanner scan = new Scanner(System.in);
		System.out.println("Who sing this the song 'Locked Away':");
		// choose singer from these 4 options
		System.out.println(
				"Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
		song = scan.nextInt();
		if (song != 1) {
			// if select wrong options
			System.out.println("Your answer is incorrect  R. City & Adam Levine's is the right answer .");
			wronganswers++;
		} else {
			System.out.println("Congrate you answer is correct");
			song++;
			correctAnswers++;
		}
	}

}
