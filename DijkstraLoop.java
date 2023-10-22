import java.util.Scanner;

public class DijkstraLoop {
    public static void main(String[] args) {
        char character;  // Declare a character variable to store user input
        Scanner in = new Scanner(System.in);  // Create a Scanner object to read input from the user

        while (true) {  // Start an infinite loop
            character = in.next().charAt(0);  // Read a single character input from the user

            switch (character) {  // Begin a switch statement to evaluate the input character
                case 'l':  // If the input character is 'l'
                    System.out.println("Go left");  // Output a message to indicate going left
                    break;  // Exit the switch statement

                case 'r':  // If the input character is 'r'
                    System.out.println("Go right");  // Output a message to indicate going right
                    break;  // Exit the switch statement

                default:  // If the input character is neither 'l' nor 'r
                    System.out.println("Invalid input. Please enter 'l' or 'r'");  // Output an error message
                    // You can choose to either continue the loop or exit the program on invalid input
                    // continue; // Uncomment this line to continue the loop on invalid input
                    // return; // Uncomment this line to exit the program on invalid input
            }
        }
    }
}
