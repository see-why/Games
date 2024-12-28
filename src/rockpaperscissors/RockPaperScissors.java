package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private Object[] objects = { new Rock(), new Paper(), new Scissors() };
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		int playerScore = 0;
		int counter = 3;
		
		System.out.println("Game Running");

		while(counter > 0) {
			System.out.println("Choose your option...");
			System.out.println("1 for Rock, 2 for Paper and 3 for Scissors");
			System.out.print("> ");
			
			Random random = new Random();
			var obj1 = objects[random.nextInt(objects.length)];
			
			int choice = scanner.nextInt();
			Object obj2 = getObject(choice);

			System.out.printf("You chose: %s \n", obj2.getName());
			System.out.printf("Computer chose: %s \n", obj1.getName());
			
			int comparisonIndex = obj1.compareTo(obj2);
			playerScore += comparisonIndex;

			System.out.println(printResult(comparisonIndex));
			counter--;
		}
		
		System.out.println(printFinalResult(playerScore));
		scanner.close();
	}
	
	private Object getObject(int index) {
		if (index == 1 || index == 2) {
			return objects[index - 1];
		}

		return objects[2];
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
