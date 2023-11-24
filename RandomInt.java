/**
 * RandomInt class generates a random integer within a specified range using command-line arguments.
 */
public class RandomInt {

    /**
     * Main method takes a command-line argument representing the upper bound of the random integer range,
     * generates a random double between 0 (inclusive) and 1 (exclusive), and converts it to an integer within
     * the specified range. The result is then printed to the console.
     *
     * @param args Command-line arguments. Expects a single argument representing the upper bound (exclusive) of
     *             the random integer range.
     */
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length != 1) {
            System.out.println("Please provide a single command-line argument representing the upper bound of the random integer range.");
            return;
        }

        // Parse the command-line argument to get the upper bound of the random integer range
        int upperBound;
        try {
            upperBound = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer as the upper bound of the random integer range.");
            return;
        }

        // Generate a random double between 0 (inclusive) and 1 (exclusive)
        double randomValue = Math.random();

        // Convert the random double to an integer within the specified range
        int randomInt = (int) (randomValue * upperBound);

        // Print the result of the operation
        System.out.print("Result of the operation is: ");
        System.out.println(randomInt);
    }
}

/**
 * Driver class for testing the RandomInt program.
 */
class RandomIntDriver {
    public static void main(String[] args) {
        // Example usage: java RandomInt 100
        RandomInt.main(new String[]{"100"});
    }
}
