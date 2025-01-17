# Hangman

## Description
Hangman is a classic word-guessing game implemented in Java.

## How to Run
1. Ensure you have Java installed on your system.
2. Navigate to the `hangman` directory:
   ```bash
   cd src/hangman
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the game:
   ```bash
   java App
   ```

## How to Play
1. The game will select a random word.
2. You need to guess the word by suggesting letters.
3. You have a limited number of incorrect guesses before the game ends.
4. If you guess the word before running out of attempts, you win!

## Files
- `App.java`: The main game file
- `Hangman.java`: Contains the game logic
- `RandomWord.java`: Handles the selection of random words

## Note
Ensure you have a word list file (if required by the implementation) in the correct location.