# Rock Paper Scissors

## Description
Rock Paper Scissors is a hand game usually played between two people, implemented here in Java.

## How to Run
1. Ensure you have Java installed on your system.
2. Navigate to the `rockpaperscissors` directory:
   ```bash
   cd src/rockpaperscissors
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
1. When prompted, enter your choice (rock, paper, or scissors).
2. The computer will randomly select its choice.
3. The winner is determined based on the classic rules:
   - Rock beats Scissors
   - Scissors beats Paper
   - Paper beats Rock
4. The game will display the result and ask if you want to play again.

## Files
- `App.java`: The main game file
- `RockPaperScissors.java`: Contains the game logic
- `enums/Choice.java`: Enum for game choices

## Note
Make sure to type your choice exactly as prompted (usually lowercase) for the game to recognize it correctly.