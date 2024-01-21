/**
 * This class provides an example of a method with multiple return statements
 * based on the comparison of two integer values.
 */
public class RightMethodReturn {

    /**
     * Compares two integer values and returns a string indicating the result of the comparison.
     *
     * @param value1 The first integer value to compare.
     * @param value2 The second integer value to compare.
     * @return A string indicating whether the first value is less than, greater than, or equal to the second value.
     */
    static String compare(int value1, int value2) {
        // Check if value1 is less than value2
        if (value1 < value2) {
            return "Comparison Less Than";
        }
        // Check if value1 is greater than value2
        else if (value1 > value2) {
            return "Comparison Greater Than";
        }
        // If neither less than nor greater than, values are equal
        return "Comparison Equal";
    }

    /**
     * The main method demonstrates the usage of the compare method with two integer operands.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Define two integer operands
        int operand1 = 1, operand2 = 2;

        // Call the compare method and store the result
        String result = compare(operand1, operand2);

        // Print the result of the comparison
        System.out.println(result);
    }
}
