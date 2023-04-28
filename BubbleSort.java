import java.util.Arrays;

/**
 * Bubble class for sorting an array using Bubble sort algorithm
 */

public class BubbleSort {

    /**
     * Main method to execute the sorting
     *
     * @param args command line arguments (not used here)
     */

    public static void main(String[] args) {

        // Array to be sorted
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        // Declare variables
        int head, tail, temp;

        // Display the source array
        System.out.print("Source array: ");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println("\n");

        // Bubble Sort implementation
        for (head = 1; head < nums.length; head++) {
            for (tail = nums.length - 1; tail >= head; tail--) {
                if (nums[tail - 1] > nums[tail]) {
                    temp = nums[tail - 1];
                    nums[tail - 1] = nums[tail];
                    nums[tail] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(nums));
    }
}

