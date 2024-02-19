/**
 * This program generates an array of random integers, finds the maximum and minimum values along with their positions,
 * and displays the generated array along with these values and positions.
 */
public class MaxMinArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = new int[10];

        // Fill the array with random values ranging from -5 to 95
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100) - 5);
        }

        // Display the generated array
        System.out.println("Generated Array:");
        for (int j : arr) {
            System.out.print(j + "  ");
        }
        System.out.println("\n");

        // Initialize variables to hold maximum and minimum values and their respective positions
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        // Find the maximum and minimum values and their positions in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // Display the maximum and minimum values along with their positions
        System.out.println("\nMax value in generated array is: " + max);
        System.out.println("Min value in generated array is: " + min);
        System.out.println("Index of Max value: " + maxIndex);
        System.out.println("Index of Min value: " + minIndex);
    }
}
