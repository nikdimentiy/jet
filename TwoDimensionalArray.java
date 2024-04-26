/**
 * This Java program demonstrates the creation and manipulation of a two-dimensional array.
 * It initializes a 3x5 array with calculated values, sums up all the elements in the array,
 * and outputs each element along with the total sum at the end.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Variable to store the total sum of all elements in the array
        int sum = 0;

        // Define a 3x5 two-dimensional array
        int nums[][] = new int[3][5];

        // Populate the array with calculated values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                // The value is calculated as (row index + 1) * (column index + 1)
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // Iterate over the array using a "for-each" loop and calculate the sum of all values
        for (int[] row : nums) {
            for (int value : row) {
                // Output the current value
                System.out.println("The value: " + value);
                // Add the current value to the total sum
                sum += value;
            }
        }

        // Output the total sum of all elements in the array
        System.out.println("The total sum is: " + sum);
    }
}
