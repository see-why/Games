package hangman;

import java.util.Scanner;

public class Hangman {
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int triesLeft = 5;

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
			checktries();
		} while(running);
		
	}
	
	private void checktries() {
		if (triesLeft == 1) {
			System.out.println("You've lost!!!");
			System.out.printf("The correct word is: %s.\n", word.getChosenWord());
			running = false;
		} else {
			triesLeft--;
			System.out.printf("You have %d tries left.\n", triesLeft);
		}
		
	}

	void displayWord() {
		System.out.println(word);
	}
	
	void getUserInput() {
		System.out.println("Guess a letter: ");
		String guess = scanner.next();
		
		word.addGuess(guess.charAt(0));
	}
	
	void checkUserInput() {
		if (word.isGameOver()) {
			System.out.println("You've won!!!");
			displayWord();
			running = false;
		}
	}
	
	void close() {
		scanner.close();
	}
}
