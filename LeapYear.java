import java.util.Scanner;
/**
 * This class determines whether a year is a leap year.
 *
 * @author Dmitriy Nikey
 */
public class LeapYear {

    /**
     * This method prompts the user to enter a year and prints whether it is a leap year or not.
     *
     * @param args The year to check.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year.
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year.
        boolean isLeapYear = isLeapYear(year);

        // Print whether the year is a leap year or not.
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }

    /**
     * This method determines whether a year is a leap year.
     *
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {

        // Check if the year is a multiple of 4.
        if (year % 4 == 0) {

            // If the year is a multiple of 4, check if it is a multiple of 100.
            if (year % 100 == 0) {

                // If the year is a multiple of 100, check if it is a multiple of 400.
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
