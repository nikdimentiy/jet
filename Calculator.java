import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display a welcome message and instructions to the user
        System.out.println("Welcome to the Calculator App!");
        System.out.println("Enter the first number: ");
        
        // Read the first number entered by the user
        double num1 = input.nextDouble();
        
        // Read the second number entered by the user
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        
        // Ask the user to choose an operation to perform
        System.out.println("Choose an operation: ");
        System.out.println("+ - Addition");
        System.out.println("- - Subtraction");
        System.out.println("* - Multiplication");
        System.out.println("/ - Division");
        
        // Read the operation entered by the user
        String operation = input.next();
        
        // Perform the selected operation
        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operation selected!");
                break;
        }
    }
}
