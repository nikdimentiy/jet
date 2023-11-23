import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {
        // Define the correct login and password credentials
        String validLogin = "Admin";
        String validPassword = "P@ssw0rd";

        // Create a Scanner object to handle user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their login
        System.out.print("Enter login, please: ");

        // Capture the user's login input
        String enteredLogin = sc.next();

        // Check if the entered login matches the valid login
        if (validLogin.equals(enteredLogin)) {
            // Prompt the user to enter their password
            System.out.print("Enter password, please: ");

            // Capture the user's password input
            String enteredPassword = sc.next();

            // Check if the entered password matches the valid password
            if (validPassword.equals(enteredPassword)) {
                // Welcome the user if they entered correct credentials
                System.out.println("Welcome " + enteredLogin + ", you have successfully entered the system!");
            } else {
                // Inform the user if they entered an incorrect password
                System.out.println("You entered an incorrect password!");
            }
        } else {
            // Inform the user if they entered an invalid login
            System.out.println("There is no user with that name!");
        }
    }
}
