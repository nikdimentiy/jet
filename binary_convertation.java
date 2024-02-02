package practice;

import java.util.Scanner;

public class Program {
    /**
     * This is the main method of the program.
     * It takes an integer input, converts it to binary using the Converter class,
     * and prints the result.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        // Print the binary representation of the entered integer
        System.out.print(Converter.toBinary(x));
    }
}

class Converter {
    /**
     * Converts an integer to its binary representation.
     *
     * @param number The integer to be converted to binary.
     * @return The binary representation of the input integer.
     */
    public static String toBinary(int number) {
        // StringBuilder to store the binary representation
        StringBuilder binary = new StringBuilder();

        // Loop until the input number becomes 0
        while (number > 0) {
            // Insert the remainder (either 0 or 1) at the beginning of the binary string
            binary.insert(0, (number % 2));

            // Divide the number by 2 to move to the next bit
            number /= 2;
        }

        // Return the binary representation as a string
        return binary.toString();
    }
}
