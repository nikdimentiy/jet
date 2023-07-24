// CodeWars Task:
// Title: "Opposite Number"
// Link: Opposite Number - CodeWars: https://www.codewars.com/kata/56dec885c54a926dcd001095/solutions/java
// Task Description:
// The task is to write a function called opposite that takes an integer as input and returns its opposite.
// The function should return the negation of the input integer. 
// For example, if the input is 5, the function should return -5. If the input is -12, the function should return 12.

package codewars;

public class OppositeNumber2 {
    /**
     * Returns the opposite of the given integer.
     *
     * @param number The input integer for which to find the opposite.
     * @return The opposite of the input number.
     */
    public static int opposite(int number) {
        // Multiply the number by -1 to get its opposite
        return -number;
    }

    /**
     * Main method to test the OppositeNumber2 class.
     *
     * @param args Command-line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Test cases
        int number1 = 1;
        int number2 = 14;
        int number3 = -34;

        // Find the opposites of the test cases using the opposite method
        int result1 = opposite(number1);
        int result2 = opposite(number2);
        int result3 = opposite(number3);

        // Print the results
        System.out.println("Opposite of " + number1 + " is: " + result1); // Output: Opposite of 1 is: -1
        System.out.println("Opposite of " + number2 + " is: " + result2); // Output: Opposite of 14 is: -14
        System.out.println("Opposite of " + number3 + " is: " + result3); // Output: Opposite of -34 is: 34
    }
}

