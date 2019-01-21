package guessnumber;

import java.util.Scanner;

public class GuessNumberMenu {

	// asks for limit, starts game
	public static void main(String[] args) {
		GuessNumber guesser = new GuessNumber();
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an end-value for the random number (exclusive) ---> ");
		int max = kboard.nextInt();
		int randNum = guesser.getRandom(max);
		guesser.guess(randNum, max);
		kboard.close();
	}

}
