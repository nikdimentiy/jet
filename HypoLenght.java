// This program calculates the length of the hypotenuse in a right-angled triangle.

import java.util.Scanner; // Import the Scanner class for user input

public class HypoLength {
    public static void main(String[] args) {
        Scanner cathet = new Scanner(System.in);  // Create a Scanner object for user input

        System.out.print("Enter value of first cathet: ");
        double x = cathet.nextDouble();  // Read user input for the first cathetus

        System.out.print("Enter value of second cathet: ");
        double y = cathet.nextDouble();  // Read user input for the second cathetus

        double z;  // Create a variable to store the hypotenuse length

        // Calculate the length of the hypotenuse using the Pythagorean theorem
        z = Math.sqrt(x * x + y * y);

        System.out.println();
        System.out.println("Hypotenuse length is: " + z);  // Display the calculated hypotenuse length
    }
}
