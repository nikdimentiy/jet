// CodeWars task: solution -> https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

public class Positive {
    
    /**
     * Returns the sum of all positive integers in the given integer array.
     *
     * @param arr the integer array to sum up
     * @return the sum of all positive integers in the array, or 0 if there are no positive integers
     */
    public static int sum(int[] arr) {
        int sum = 0;  // initialize the sum to 0
        for (int num : arr) {  // loop over each element of the array
            if (num > 0) {  // if the element is positive
                sum += num;  // add it to the sum
            }
        }
        return sum;  // return the total sum of positive numbers
    }
}
