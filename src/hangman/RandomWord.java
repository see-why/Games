package hangman;

import java.util.Random;

/*
 * “You have probably waited impatiently for a letter to fix the date of your return to us; and I was at first tempted to write only a few lines, 
 * merely mentioning the day on which I should expect you. But that would be a cruel kindness, and I dare not do it. What would be your surprise, 
 * my son, when you expected a happy and glad welcome, to behold, on the contrary, tears and wretchedness? And how, Victor, can I relate our misfortune? 
 * Absence cannot have rendered you callous to our joys and griefs; and how shall I inflict pain on my long absent son? I wish to prepare you for the woeful
 *  news, but I know it is impossible; even now your eye skims over the page to seek the words which are to convey to you the horrible tidings.
 */

public class RandomWord {
	private final Random random = new Random();
	private final String[] words = { "letter",
			"misfortune", 
			"callous", 
			"wretchedness", 
			"impossible", 
			"kindness",
			"absence",
			"impatiently",
			"surprise",
			"contrary"
			};
	private String chosenWord;
	private final char[] characters;
	
	public RandomWord() {
		this.chosenWord = words[random.nextInt(words.length)];
		characters = new char[this.chosenWord.length()];
	}

	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();

		for(char character: characters) {
			char str = (character == '\u0000') ? '_' : character;
			text.append(str).append(' ');
		}

		return text.toString();
	}

	public void addGuess(char c) {
		char[] chosenWordCharacters = getChosenWord().toCharArray();
		
		for (int i = 0; i < chosenWordCharacters.length; i++) {
			if (chosenWordCharacters[i] == c) {
				characters[i] = c;
			}
		}
		
	}

	public boolean isGameOver() {
		for (char c: characters) {
			if ( c == '\u0000') {
				return false;
			}
		}

		return true;
	}

	public String getChosenWord() {
		return chosenWord;
	}

	public void setChosenWord(String chosenWord) {
		this.chosenWord = chosenWord;
	}
	
}
