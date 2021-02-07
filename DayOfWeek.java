// Sample of switch case statement

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int myDay;
        System.out.println("Enter the day of the week number: 1-2-3-4-5-6-7:");
        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        // Convert the value of the (string) variable myDay to an integer value
        // and write it to a variable named MyDay of type (int)

        switch (myDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered a non-existent day of the week");
                break;
        }
    }
}
