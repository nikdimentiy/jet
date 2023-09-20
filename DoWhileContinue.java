// Java program to demonstrate the usage of the do-while loop and continue statement

public class DoWhileContinue {

    public static void main(String[] args) {
        int counter = 0; // Declare and initialize a variable 'counter' to 0.

        do {
            counter++; // Increment the 'counter' by 1 in each iteration.
            System.out.println("Counter " + counter); // Print the current value of 'counter'.

            if (true) continue; // This line will always execute the 'continue' statement,
                              // which skips the rest of the loop body and starts the next iteration.

            System.out.println("This line will not be executed"); // This line will never be executed.
        } while (counter < 3); // Continue looping as long as 'counter' is less than 3.

        System.out.println("Generated " + counter + " iteration!"); // Print the number of iterations completed.
    }
}

