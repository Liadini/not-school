package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	// returns random number within specified limits
	public int getRandom(int end) {
		Random rand = new Random();
		return rand.nextInt(end);
	}
	
	// prompts user to guess number
	public void guess(int n, int max) {
		Scanner kboard = new Scanner(System.in);
		int input = 0, numOfGuesses = 0;
		do {
			System.out.print("Guess a number! ---> ");
			input = kboard.nextInt();
			numOfGuesses++;
			if (input>max || input <= -1)
				System.out.println("That number is outside the range of the random number!");
			if (input<n && input>-1)
				System.out.println("That's too low!");
			else if (input>n && input<=max)
				System.out.println("That's too high!");
		} while (input != n);
		kboard.close();
		double initialProbability = Math.round(1.0 / (double) max * 1000.0) / 10.0;
		double finalProbability = Math.round(1.0 / (double) (max - numOfGuesses) * 1000.0) / 10.0;
		System.out.println("That took you " + numOfGuesses + " guesses.");
		System.out.println("The probability of guessing the number was " + initialProbability + "% on your first"
				+ "guess, and " + finalProbability + "% on your final guess. Pretty impressive!");
	}
}
