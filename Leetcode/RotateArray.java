// LeetCode task: solution -> https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
// 🎯 Coding interview preparation 🍀

import java.util.Arrays;

public class RotateArray {
    /**
     * Rotates an array of integers to the right by k steps in place.
     *
     * @param nums The array of integers to be rotated.
     * @param k    The number of steps to rotate.
     */
    public void rotate(int[] nums, int k) {
        // Calculate the effective number of rotations
        k = k % nums.length;

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    /**
     * Reverses a sublist of the array in place.
     *
     * @param nums  The array of integers to be reversed.
     * @param start The starting index of the sublist.
     * @param end   The ending index of the sublist.
     */
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Increment the start index and decrement the end index
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Solution solution = new Solution();
        System.out.println("Original Array: " + Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
