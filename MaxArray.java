/**
 * MaxArray class finds the maximum element in an integer array and prints it to the console.
 */
public class MaxArray {

    /**
     * Finds the maximum element in an integer array.
     *
     * @param arr The input integer array.
     * @return The maximum value in the array.
     */
    public static int findMax(int[] arr) {
        // Check if the array is not empty
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Set the initial maximum value to the first element of the array
        int max = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than the current maximum, update the maximum
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the maximum value
        return max;
    }

    /**
     * The main method serves as the driver code for testing the findMax function.
     */
    public static void main(String[] args) {
        // Example 1: Array with positive and negative numbers
        int[] exampleArray1 = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};
        int result1 = findMax(exampleArray1);
        System.out.println("Max for exampleArray1 is " + result1);

        // Example 2: Array with all positive numbers
        int[] exampleArray2 = {3, 8, 12, 17, 9, 6};
        int result2 = findMax(exampleArray2);
        System.out.println("Max for exampleArray2 is " + result2);

        // Example 3: Array with a single element
        int[] exampleArray3 = {-10};
        int result3 = findMax(exampleArray3);
        System.out.println("Max for exampleArray3 is " + result3);

        // Example 4: Empty array (should throw an exception)
        try {
            int[] exampleArray4 = {};
            int result4 = findMax(exampleArray4);
            System.out.println("Max for exampleArray4 is " + result4);
        } catch (IllegalArgumentException e) {
            System.out.println("Example 4: " + e.getMessage());
        }
    }
}
