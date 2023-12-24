import java.util.Scanner;

/**
 * This program implements a mini-game where the player tries to guess a mystery color
 * within a limited number of attempts.
 */
public class GuessColor {

    public static void main(String[] args) {
        // Display introductory messages to the player
        System.out.println("Guess the mystery color in five attempts!");
        System.out.println("Possible colors: ");
        System.out.println("Red, brown, blue, green, " +
                           "yellow, cyan, lime, white, " +
                           "black, purple, pink, orange");
        System.out.println("To exit the program, enter - exit.");

        // Constants for the game
        final int MAX_ATTEMPT = 5; // Allowed number of attempts
        int attempt = 0;           // The attempt counter
        String color = "red";      // The mystery color
        Scanner in = new Scanner(System.in);

        // Main game loop
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Attempt " + attempt + ": ");
            String value = in.next();

            // Check if the player wants to exit the game
            if (value.equals("exit")) {
                break;
            }

            // Check if the guessed color is incorrect and continue to the next attempt
            if (!value.equals(color)) {
                continue;
            }

            // Congratulate the player on guessing the correct color and end the game
            System.out.println("Congratulations, you guessed right on the " + attempt + " attempts");
            break;
        }

        // Display a message indicating that the game is over
        System.out.println("Game over!");
    }
}
