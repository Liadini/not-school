package guessnumber;

import java.util.Scanner;

public class GuessNumberMenu {

	// asks for limit, starts game
	public static void main(String[] args) {
		boolean shouldContinue = true;
		GuessNumber guesser = new GuessNumber();
		Scanner kboard = new Scanner(System.in);
		do {
			System.out.print("Would you like to play? ---> ");
			switch (kboard.next().toUpperCase()) {
			case "YES":
			case "YE":
			case "YS":
			case "Y":
				System.out.print("Enter an end-value for the random number (exclusive) ---> ");
				int max = kboard.nextInt();
				int randNum = guesser.getRandom(max);
				guesser.guess(randNum, max);
				break;
			case "NOPE":
			case "NAH":
			case "NO":
			case "N":
				System.out.println("Quitting now.");
				kboard.close();
				shouldContinue = false;
				break;
			default:
				System.out.println("I'm sorry, that wasn't an option! Please try again.");
			}

		} while (shouldContinue);
	}

}
