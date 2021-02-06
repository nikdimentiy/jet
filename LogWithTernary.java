// This small code introduces how to use the ternary operator in first step of authentication

import java.util.Scanner;

public class LogWithTernary {
    // a ternary conditional operation

    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Enter your login: ");
        Scanner in = new Scanner(System.in);

        // create a variable named "login" of the String type and accept input from the user into it
        String login = in.next();

        // variable "string" assign the return value of the ternary operator
        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
