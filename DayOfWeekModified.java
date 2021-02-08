// Sample of switch code statement (modified)

import java.util.Scanner;

public class DayOfWeekModified {
    public static void main(String[] args) {
        int myDay;
        System.out.println("Enter the day of the week number: 1-2-3-4-5-6-7:");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("This day of the week is a Working day!");
                break;
            case "6":
            case "7":
                System.out.println("This day of the week is a Day Off!");
                break;

            default:
                System.out.println("You entered a non-existent day of the week.");
                break;
        }
    }
}
