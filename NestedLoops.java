/**
 * This class demonstrates nested loops in Java.
 * It prints a pattern using nested loops.
 */
public class NestedLoops {

    /**
     * The main method, entry point of the program.
     * It contains nested loops to print a pattern.
     */
    public static void main(String[] args) {
        // Outer loop to control rows
        for (int k = 1; k <= 6; k++) {
            // Inner loop to control columns
            for (int i = 1; i <= 6; i++) {
                // Print the character followed by a space
                System.out.print("$" + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
