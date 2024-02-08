import java.util.Scanner;

public class DayOfWeekModified {
    /**
     * This program takes a user input representing a day of the week and
     * outputs whether it's a working day or a day off.
     * The input should be a number from 1 to 7, representing Monday to Sunday.
     */

    public static void main(String[] args) {
        // Prompt the user to enter the day of the week number
        System.out.println("Enter the day of the week number (1-7):");
        
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Read the user input
        String day = in.next();

        // Use a switch statement to determine the day of the week
        switch (day) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                // If the day is 1 to 5 (Monday to Friday), it's a working day
                System.out.println("This day of the week is a Working day!");
                break;
            case "6":
            case "7":
                // If the day is 6 or 7 (Saturday or Sunday), it's a day off
                System.out.println("This day of the week is a Day Off!");
                break;
            default:
                // If the input doesn't match any valid day, print an error message
                System.out.println("You entered a non-existent day of the week.");
                break;
        }
        
        // Close the Scanner to prevent resource leak
        in.close();
    }
}
