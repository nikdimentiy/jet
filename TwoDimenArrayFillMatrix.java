// Two-dimensional arrays fill with matrix look
public class TwoDimenArrayFillMatrix {
    public static void main(String[] args) {
        // The compiler determines the size of the array
        // based on the initialization expression
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
