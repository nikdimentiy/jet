/**
 * This class demonstrates simple recursion in Java.
 * Recursion is a technique where a method calls itself to solve a problem.
 */
public class MethodsRecursion {

    /**
     * A recursive method that decrements the counter until it reaches zero.
     * @param counter an integer representing the current count
     */
    static void recursion(int counter) {
        counter--; // Decrement the counter
        
        // Output the first half of the method with the current counter value
        System.out.println("The first half of the method: " + counter);

        // Recursively call the method if the counter is not zero
        if (counter != 0)
            recursion(counter);

        // Output the second half of the method with the current counter value
        System.out.println("The second half of the method " + counter);
    }

    /**
     * The main method to execute the recursion demonstration.
     * @param args command-line arguments (not used in this demonstration)
     */
    public static void main(String[] args) {
        recursion(3); // Start the recursion with an initial counter value of 3
    }
}
