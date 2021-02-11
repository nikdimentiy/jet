// Mini-game - guess color
import java.util.Scanner;

public class GuessColor {

    public static void main(String[] args) {
        System.out.println("Guess the mystery color in five attempts!");
        System.out.println("Possible collors: ");
        System.out.println("Red, brown, blue, green, " +
                           "yellow, cyan, lime, white, " +
                           "black, purple, pink, orange");
        System.out.println("To exit the program, enter - exit.");

        final int MAX_ATTEMPT = 5; // Allowed number of attempts
        int attempt = 0;           // The attempt counter
        String color = "red";      // The mystery color
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Attempt" + attempt + ": ");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Congratulations, you guessed right on the " + attempt + " attempts");
            break;
        }

        System.out.println("Game over!");
    }
}
