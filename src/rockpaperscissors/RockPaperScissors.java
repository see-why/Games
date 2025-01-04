package rockpaperscissors;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import rockpaperscissors.enums.Choice;

public class RockPaperScissors {
	private static final int ROUNDS = 3;
	private static final String PROMPT_MESSAGE = 
		"Choose your option...\n1 for Rock, 2 for Paper and 3 for Scissors\n> ";
	private final Choice[] choices = Choice.values();
	private final Random random = new Random();

	public void run() {
		int playerScore = 0;
		int roundsLeft = ROUNDS;
		
		System.out.println("Game Running");
		try (Scanner scanner = new Scanner(System.in)) {
			while (roundsLeft > 0) {
				Choice computerChoice = getComputerChoice();
				Choice playerChoice = getPlayerChoice(scanner);
				
				displayChoices(playerChoice, computerChoice);
				playerScore += playRound(playerChoice, computerChoice);
				roundsLeft--;
			}
			System.out.println(getFinalResult(playerScore));
		}
	}

	private Choice getComputerChoice() {
		return choices[random.nextInt(choices.length)];
	}

	private Choice getPlayerChoice(Scanner scanner) {
		int choice = getValidSelection(scanner);
		return (choice == 3) ? choices[2] : choices[choice - 1];
	}

	private void displayChoices(Choice playerChoice, Choice computerChoice) {
		System.out.printf("You chose: %s%nComputer chose: %s%n", 
			playerChoice, computerChoice);
	}

	private int playRound(Choice playerChoice, Choice computerChoice) {
		int result = playerChoice.beats(computerChoice);
		System.out.println(getRoundResult(result));
		return result;
	}

	private int getValidSelection(Scanner scanner) {
		while (true) {
			try {
				System.out.print(PROMPT_MESSAGE);
				int choice = Integer.parseInt(scanner.nextLine());
				
				if (choice > 0 && choice <= 3) {
					return choice;
				}
				throw new NumberFormatException();
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Invalid Selection.");
			}
		}
	}
	
	private String getRoundResult(int comparisonIndex) {
		return switch (comparisonIndex) {
			case -1 -> "You lost this round!";
			case 0 -> "It's a tie!";
			case 1 -> "You won this round!";
			default -> throw new IllegalStateException("Unexpected value: " + comparisonIndex);
		};
	}
	
	private String getFinalResult(int playerScore) {
		return switch (Integer.compare(playerScore, 0)) {
			case 1 -> "You are the overall winner!!!!";
			case -1 -> "Sorry, Computer is the champ!!!!";
			case 0 -> "Whew, it's an overall tie!!!!";
			default -> throw new IllegalStateException("Unexpected score: " + playerScore);
		};
	}
}
