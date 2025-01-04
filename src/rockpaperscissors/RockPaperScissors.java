package rockpaperscissors;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import rockpaperscissors.enums.Choice;

public class RockPaperScissors {
	private final Choice[] choices = Choice.values();

	public void run() {
		int playerScore = 0;
		int counter = 3;
		
		System.out.println("Game Running");
		try (Scanner scanner = new Scanner(System.in)) {
			while(counter > 0) {
				Random random = new Random();
				var obj1 = choices[random.nextInt(choices.length)];
				
				int choice = getValidSelection(scanner);
				Choice obj2 = getObject(choice);
	
				System.out.printf("You chose: %s \n", obj2.toString());
				System.out.printf("Computer chose: %s \n", obj1.toString());
				
				int comparisonIndex = obj2.beats(obj1);
				playerScore += comparisonIndex;
	
				System.out.println(printResult(comparisonIndex));
				counter--;
			}
				
			System.out.println(printFinalResult(playerScore));
		}

	}

	private int getValidSelection(Scanner scanner) {
		int choice = 0;
		while (true) {
			try {
				System.out.println("Choose your option...");
				System.out.println("1 for Rock, 2 for Paper and 3 for Scissors");
				System.out.print("> ");

				choice = Integer.parseInt(scanner.nextLine());

				if (choice <= 0 || choice > 3) {
					throw new NumberFormatException();
				}

				break;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Invalid Selection.");
			}
		}
		return choice;
	}
	
	private Choice getObject(int index) {
		if (index == 1 || index == 2) {
			return choices[index - 1];
		}

		return choices[2];
	}
	
	private String printResult(int comparisonIndex) {
		if (comparisonIndex == -1) {
			return "You lost this round!.";
		}
		
		if (comparisonIndex == 0) {
			return "It's a tie!.";
		}
		
		return "You won this round!.";
		
	}
	
	private String printFinalResult(int playerScore) {
		if (playerScore > 0) {
			return "You are the overall winner!!!!.";
		}
		
		if (playerScore < 0) {
			return "Sorry, Computer is the champ!!!!.";
		}
		
		return "Wheew, it an overall tie!!!!.";
	}
}
