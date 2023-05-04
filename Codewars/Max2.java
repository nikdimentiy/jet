// CodeWars task: solution -> https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/java

/**
 * Finds the maximum sum of a contiguous subarray in an array of integers using Kadane's algorithm.
 * If the input array is empty, the function returns 0. If the input array
 * contains only negative numbers, the function also returns 0.
 *
 * @param arr the input array of integers
 * @return the maximum sum of a contiguous subarray in the input array
 */
public class Max2 {
    public static int sequence(int[] arr) {
        int max_ending_here = 0; // initialize the current sum to 0
        int max_so_far = 0; // initialize the maximum sum to 0

        // iterate through the array and update the current sum and maximum sum
        for (int v : arr) {
            max_ending_here = Math.max(0, max_ending_here + v); // calculate the current sum using Kadane's algorithm
            max_so_far = Math.max(max_so_far, max_ending_here); // update the maximum sum if the current sum is greater
        }
        return max_so_far; // return the maximum sum
    }
}
