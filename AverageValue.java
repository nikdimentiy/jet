/**
 * The AverageValue class calculates the minimum value, maximum value, and average of the elements in a given array.
 */
public class AverageValue {

    /**
     * Main method to perform calculations and display the results.
     *
     * @param args The command-line arguments (unused in this case).
     */
    public static void main(String[] args) {
        // Given array
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        // Initialize variables for max, min, sum, and average
        int tempMax = arr[0];
        int tempMin = arr[0];
        int sum = 0;
        double averageValue;

        // Calculate the sum of elements in the array
        for (int element : arr) {
            sum += element;
        }

        // Calculate the average value
        averageValue = (double) sum / arr.length;

        // Find the min and max values
        for (int element : arr) {
            // Finding the min value
            if (element < tempMin) {
                tempMin = element;
            }
            // Finding the max value
            if (element > tempMax) {
                tempMax = element;
            }
        }

        // Output the results
        System.out.println("Max value in the array is: " + tempMax);
        System.out.println("Min value in the array is: " + tempMin);
        System.out.format("The average value of the array is: %.2f", averageValue);
    }
}
