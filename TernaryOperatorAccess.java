// TernaryOperatorAccess.java
import java.util.Scanner;

/**
 * This program demonstrates the use of a ternary operator in Java to determine the user's role based on login input.
 */
public class TernaryOperatorAccess {
    public static void main(String[] args) {
        // Initialize a string with a greeting
        String str = "Hello ";

        // Prompt the user to enter their login
        System.out.println("Enter your login: ");
        Scanner network = new Scanner(System.in);

        // Read the user's login input
        String login = network.next();

        // Use ternary operator to determine the role and concatenate it to the greeting
        // If login is "Admin", set role to "Administrator", otherwise set role to "User"
        str += login.equals("Admin") ? "Administrator" : "User";

        // Display the final greeting based on the user's role
        System.out.println(str);
    }
}
