import java.io.*;

/**
 * This class finds the maximum occurring digit in a given integer without using any arrays or strings.
 */
class MaximumOccurringDigit {

    /**
     * Counts the occurrences of a digit 'd' in the integer 'x'.
     *
     * @param x The integer in which occurrences need to be counted.
     * @param d The digit whose occurrences need to be counted.
     * @return The count of occurrences of digit 'd' in 'x'.
     */
    static int countOccurrences(int x, int d) {
        // Initialize count of digit d
        int count = 0;
        while (x > 0) {
            // Increment count if current digit is same as d
            if (x % 10 == d)
                count++;
            x = x / 10; // Move to the next digit
        }
        return count;
    }

    /**
     * Returns the maximum occurring digit in the integer 'x'.
     *
     * @param x The integer in which the maximum occurring digit needs to be found.
     * @return The maximum occurring digit in 'x'.
     */
    static int maxOccurring(int x) {
        // Handle negative number
        if (x < 0)
            x = -x;

        // Initialize result which is a digit
        int result = 0;

        // Initialize count of result
        int max_count = 1;

        // Traverse through all digits (0 to 9)
        for (int d = 0; d <= 9; d++) {
            // Count occurrences of current digit
            int count = countOccurrences(x, d);

            // Update max_count and result if needed
            if (count >= max_count) {
                max_count = count;
                result = d;
            }
        }
        return result;
    }

    /**
     * The main method to test the functionality of maxOccurring method.
     * It prints the maximum occurring digit in the integer 'x'.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int x = 1223355;
        System.out.println("Max occurring digit is " + maxOccurring(x));
    }
}
