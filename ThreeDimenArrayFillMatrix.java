/**
 * This program fills and prints a 3D array representing a matrix.
 */
public class ThreeDimenArrayFillMatrix {

    public static void main(String[] args) {
        // Define and initialize a 3D array representing a matrix
        int[][][] array = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };

        // Loop through each dimension of the array to print its elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    // Print the element at the current position in the array
                    System.out.print(array[i][j][k] + " ");
                }
                // Move to the next row within the current dimension
                System.out.print("\n");
            }
            // Move to the next dimension
            System.out.print("\n");
        }
    }
}
