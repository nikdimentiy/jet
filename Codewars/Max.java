// CodeWars task: solution -> https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/java

/**
 * Finds the maximum sum of a contiguous subarray in an array of integers.
 * If the input array is empty, the function returns 0. If the input array
 * contains only negative numbers, the function also returns 0.
 *
 * @param arr the input array of integers
 * @return the maximum sum of a contiguous subarray in the input array
 */
public class Max {
  public static int sequence(int[] arr) {
    int maxSum = 0; // initialize the maximum sum to 0
    int currSum = 0; // initialize the current sum to 0
    boolean hasPositive = false; // flag to check if the array has at least one positive element

    // check if the array contains at least one positive element
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 0) {
            hasPositive = true;
            break;
        }
        if (i == arr.length - 1) {
            return 0; // if the array contains only negative elements, return 0
        }
    }
    if (!hasPositive) {
        return 0; // if the array contains no positive element, return 0
    }

    // iterate through the array and update the current sum and maximum sum
    for (int i = 0; i < arr.length; i++) {
        currSum += arr[i];
        if (currSum < 0) {
            currSum = 0; // reset the current sum to 0 if it becomes negative
        }
        if (currSum > maxSum) {
            maxSum = currSum; // update the maximum sum if the current sum is greater
        }
    }
    return maxSum; // return the maximum sum
  }
}
