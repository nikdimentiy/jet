import java.util.Scanner;

/**
 * The Maths class provides basic math operations such as addition, subtraction, multiplication, and division.
 */
class Maths {

    /**
     * Adds two integers.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the addition.
     */
    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the subtraction.
     */
    public int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the multiplication.
     */
    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides one integer by another.
     *
     * @param num1 The numerator.
     * @param num2 The denominator.
     * @return The result of the division.
     */
    public int Divide(int num1, int num2) {
        return num1 / num2;
    }
}

/**
 * The BasicCalculator class is a simple command-line calculator that performs basic math operations.
 */
public class BasicCalculator {

    /**
     * The main method that takes user input and performs the selected math operation.
     *
     * @param args The command-line arguments (unused in this case).
     */
    public static void main(String[] args) {
        Maths math = new Maths();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Java Calculator");
        System.out.println("==============================");

        System.out.print("Enter the first number: ");
        int num1 = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = userInput.nextInt();

        System.out.print("Enter operation to perform (+, -, *, / ):");
        String operation = userInput.next();

        // Perform the selected operation and print the result
        switch (operation) {
            case "+":
                System.out.println(math.Add(num1, num2));
                break;
            case "-":
                System.out.println(math.Subtract(num1, num2));
                break;
            case "*":
                System.out.println(math.Multiply(num1, num2));
                break;
            case "/":
                System.out.println(math.Divide(num1, num2));
                break;
            default:
                System.out.println("The operation is not valid.");
        }
    }
}

/**
 * Driver class for testing the BasicCalculator program.
 */
class BasicCalculatorDriver {
    public static void main(String[] args) {
        // Example usage: Run the BasicCalculator program
        BasicCalculator.main(new String[]{});
    }
}
