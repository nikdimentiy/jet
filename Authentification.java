// This tiny code - simplest way to authenticate

import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";
        // create an object of the Scanner class to handle keyboard input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter login, please: ");

        // create a string local variable named "userLogin"
        // and accept input from the user into it

        String usersLogin = sc.next();

        if (login.equals(usersLogin)) {
            System.out.print("Enter password, please: ");
            String usersPassword = sc.next();

            if (password.equals(usersPassword)) {
                System.out.println("Welcome " + usersLogin + ", you enter in the system!");
            } else {
                System.out.println("You entered an incorrect password! ");
            }
        } else {
            System.out.println("There is no user with that name!");
        }
    }
}
