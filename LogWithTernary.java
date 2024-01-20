// This Java program demonstrates the use of the ternary operator in the first step of authentication.

import java.util.Scanner;

public class LogWithTernary {
    // Declaring a class named LogWithTernary

    // The main method, where the execution of the program begins
    public static void main(String[] args) {
        // Declaring a String variable named "string" and initializing it with "Hello "
        String string = "Hello ";

        // Printing a message to the console asking the user to enter their login
        System.out.println("Enter your login: ");

        // Creating a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Creating a variable named "login" of the String type and accepting input from the user into it
        String login = in.next();

        // Using the ternary operator to determine the role and concatenate it to the "string" variable
        // If login equals "Admin", append "Administrator" to "string", otherwise append "User"
        string += login.equals("Admin") ? "Administrator" : "User";

        // Printing the final result stored in the "string" variable to the console
        System.out.println(string);
    }
}
