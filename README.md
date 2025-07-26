The Number Guessing Game is a simple Java-based console application designed for beginner-level programmers to practice control flow, loops, conditionals, and user input handling. In this game, the computer generates a random number within a defined range (e.g., 1 to 100), and the player attempts to guess the number. The program gives feedback after each guess, indicating whether the guess was too high, too low, or correct. The game continues until the user guesses the correct number.


Key Features:

Random number generation using java.util.Random

User input handling via Scanner

Looping structure to allow multiple guesses

Feedback to guide the player (Too high / Too low / Correct)

Optional features:

Limited number of attempts

Replay option

Score or guess count tracking

Technologies Used:
Programming Language: Java

Libraries: java.util.Scanner, java.util.Random

How It Works:

The program starts and generates a random number between 1 and 100.

The player is prompted to guess the number.

After each guess, the program gives feedback:

If the guess is lower than the target number → "Too low!"

If the guess is higher than the target number → "Too high!"

If the guess is correct → "Congratulations! You guessed it!"

The game ends when the correct number is guessed.

Optionally, the user may be asked if they want to play again.
