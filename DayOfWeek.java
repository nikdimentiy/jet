/**
 * This program demonstrates the use of a switch statement to print the name of the day of the week.
 *
 * @author Dmitriy Nikey
 */
import java.util.Scanner;

public class DayOfWeek {

    /**
     * This method is the main method of the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get the day of the week from the user
        System.out.println("Enter the day of the week number: 1-2-3-4-5-6-7:");
        Scanner in = new Scanner(System.in);
        int myDay = in.nextInt();

        // Convert the day of the week to a string
        String dayOfWeekString = "";
        switch (myDay) {
            case 1:
                dayOfWeekString = "Monday";
                break;
            case 2:
                dayOfWeekString = "Tuesday";
                break;
            case 3:
                dayOfWeekString = "Wednesday";
                break;
            case 4:
                dayOfWeekString = "Thursday";
                break;
            case 5:
                dayOfWeekString = "Friday";
                break;
            case 6:
                dayOfWeekString = "Saturday";
                break;
            case 7:
                dayOfWeekString = "Sunday";
                break;
            default:
                dayOfWeekString = "Invalid day of the week";
                break;
        }

        // Print the name of the day of the week
        System.out.println("The day of the week is " + dayOfWeekString);
    }
}
