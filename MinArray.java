/**
 * This class demonstrates finding the minimum value in an array of integers.
 */
public class MinArray {

    /**
     * Finds the minimum value in the given array of integers.
     * @param list an array of integers
     * @return the minimum value found in the array
     */
    static int findMin(int[] list) {
        int min = list[0]; // Assume the first element as the minimum

        // Iterate through the array to find the minimum value
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        return min; // Return the minimum value
    }

    /**
     * The main method to execute the demonstration.
     * @param args command-line arguments (not used in this demonstration)
     */
    public static void main(String[] args) {
        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};
        
        // Call the findMin method to get the minimum value
        int min = findMin(list);

        System.out.println("Min is " + min);
    }
}
