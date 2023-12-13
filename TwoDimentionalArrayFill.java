/**
 * The TwoDimentionalArrayFill class demonstrates the use of a two-dimensional array
 * and a nested loop to fill and print values in the array.
 */
public class TwoDimentionalArrayFill {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        int sizeI = 3; // Number of rows in the 2D array
        int sizeJ = 3; // Number of columns in the 2D array
        int[][] array = new int[sizeI][sizeJ];

        // Array fill using nested loops
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                array[i][j] = i * j + 1;
            }
        }

        // Printing the filled 2D array
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
