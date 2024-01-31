/**
 * MethodsBinaryDigit class contains a method to convert a decimal number to binary format.
 */
public class MethodsBinaryDigit {

    /**
     * Converts a decimal number to binary format and prints the result.
     *
     * @param n The decimal number to be converted.
     */
    static void converter(int n) {
        // Temporary variable to store the remainder when dividing by 2.
        int temp;

        // Calculate the remainder when dividing the number by 2.
        temp = n % 2;

        // Check if the number is greater than or equal to 2 for recursive conversion.
        if (n >= 2)
            converter(n / 2);

        // Print the remainder, which represents the binary digit.
        System.out.print(temp);
    }

    /**
     * The main method where the program starts execution.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Decimal number to be converted to binary.
        int n = 6487;

        // Call the converter method to perform the conversion and print the result.
        converter(n);
    }
}
