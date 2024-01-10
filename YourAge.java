import java.util.Scanner;

public class YourAge {

    /**
     * Main method of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Set the current year to 2022
        int currentYear = 2022;

        try {
            // Try getting input from console
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // If console input is not available, get input from scanner
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    /**
     * Get user input using console.
     *
     * @param currentYear The current year used for calculating age.
     * @return A string with the user's age.
     */
    public static String getInputFromConsole(int currentYear) {

        // Get user's name from console input
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        // Get user's date of birth from console input
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        // Return a string with the user's age
        return "So you are " + age + " years old";
    }

    /**
     * Get user input using Scanner.
     *
     * @param currentYear The current year used for calculating age.
     * @return A string with the user's age.
     */
    public static String getInputFromScanner(int currentYear) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user's name from scanner input
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        // Get user's date of birth from scanner input with input validation
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            // Ask the user to enter a valid year of birth within a certain range
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));

            try {
                // Check if the entered data is a valid number and calculate the age
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException badUserData) {
                // Handle the case when non-numeric characters are entered
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        // Return a string with the user's age
        return "So you are " + age + " years old";
    }

    /**
     * Check the validity of the user's date of birth.
     *
     * @param currentYear The current year used for calculating age.
     * @param dateOfBirth The user's date of birth as a string.
     * @return The user's age if the date of birth is valid, otherwise -1.
     */
    public static int checkData(int currentYear, String dateOfBirth) {

        // Parse the user's date of birth as an integer
        int dob = Integer.parseInt(dateOfBirth);

        // Set the minimum allowable year (125 years ago)
        int minimumYear = currentYear - 125;

        // Check if the entered year of birth is within a valid range
        if ((dob < minimumYear) || (dob > currentYear)) {
            // Return -1 if the date of birth is not valid
            return -1;
        }

        // Calculate and return the user's age
        return (currentYear - dob);
    }
}
