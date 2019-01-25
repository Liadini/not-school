package sentencegenerator;

import java.util.Scanner;

public class SentenceGeneratorMenu {

	// asks user for type of sentence, generates it
	public static void main(String[] args) throws InterruptedException {
		SentenceGenerator generator = new SentenceGenerator();
		Scanner sc = new Scanner(System.in);
		boolean shouldContinue = true;
		do {
			System.out.println("1) Shakespearean Insult Generator!");
			System.out.println("2) Random Sentence Generator (in progress)!");
			System.out.println("3) Quit!");
			System.out.print("Choose an option ---> ");
			String choice = sc.next();
			switch (choice) {
			case "1":
			case "shakespeare":
			case "Shakespeare":
				System.out.println(generator.getShakespeareanInsult() + "\n");
				Thread.sleep(1000);
				break;
			case "2":
			case "sentence":
			case "Sentence":
				System.out.println("I'm sorry, but this menu option is a work in progress. Please pick another! \n");
				Thread.sleep(1000);
				break;
			case "3":
			case "quit":
				System.out.println("Thanks for playing!");
				sc.close();
				shouldContinue = false;
				break;
			default:
				System.out.println("I'm sorry, but that menu option doesn't exist. Please pick another! \n");
				Thread.sleep(1000);
			}
		} while (shouldContinue);
	}
}
