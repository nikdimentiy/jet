// Leetcode coding task: solution -> https://leetcode.com/problems/two-sum/description/

package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A class that provides a method to find two numbers in an array that add up to a given target.
 */
public class TwoSum {

	/**
	 * Returns an array of two indexes of the numbers that add up to the target, or an empty array if none exists.
	 * @param nums an array of integers
	 * @param target an integer
	 * @return an array of two integers
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>(); // a map to store the numbers and their indexes
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // the number that needs to be paired with nums[i]
			if (map.containsKey(complement)) { // if the complement is already in the map, we have a solution
				return new int[] { map.get(complement), i }; // return the indexes of the complement and nums[i]
			} else {
				map.put(nums[i], i); // otherwise, put nums[i] and its index in the map
			}
		}
		return new int[] {}; // if no solution is found, return an empty array
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15, 8, 5, 10}; // an example array
		int target = 15; // an example target

		int[] indexes = twoSum(nums, target); // call the method

		System.out.println(Arrays.toString(indexes)); // print the result
	}

}
