/**
 * TwoDimenArrayFillMatrix class demonstrates the initialization and printing
 * of a two-dimensional array with a matrix look.
 */
public class TwoDimenArrayFillMatrix {

    /**
     * The main method initializes a 3x3 matrix and prints its elements.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate through rows
        for (int i = 0; i < array.length; i++) {
            // Iterate through columns
            for (int j = 0; j < array[i].length; j++) {
                // Print each element with a space
                System.out.print(" " + array[i][j]);
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
