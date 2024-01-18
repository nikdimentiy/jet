/**
 * This class demonstrates the calculation of the factorial of a number using recursion.
 */
public class MethodsFactorial {

    /**
     * Recursive method to calculate the factorial of a number.
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0)
            return 1;
        // Recursive case: n! = n * (n-1)!
        else
            return n * factorial(n - 1);
    }

    /**
     * Main method to demonstrate the usage of the factorial method.
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Calculate the factorial of 10
        int factorialResult = factorial(10);

        // Print the result
        System.out.println(factorialResult);
    }
}
