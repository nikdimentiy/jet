/**
 * ForInFor class demonstrates a nested (for) loop to construct a square of stars (*).
 * Each line of the square contains 10 stars, and the square itself consists of 10 lines.
 *
 * 🌟 Usage:
 * - Compile: javac ForInFor.java
 * - Run: java ForInFor
 *
 * 🚀 Output:
 * **********
 * **********
 * **********
 * **********
 * **********
 * **********
 * **********
 * **********
 * **********
 * **********
 */
public class ForInFor {

    public static void main(String[] args) {
        // Outer loop for constructing each line of the square
        for (int i = 0; i < 10; i++) {

            // Inner loop to output one line of 10 stars
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            // Move to the new line for the next row of the square
            System.out.println();
        }
    }
}
