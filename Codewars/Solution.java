// CodeWars task: solution -> https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

/**
 * Calculates the number of trailing zeros in n! (the factorial of n)
 * @param n an integer value for which to calculate the number of trailing zeros
 * @return the number of trailing zeros in n!
 */
public class Solution {
  public static int zeros(int n) {
      int count = 0;  // initialize the count of trailing zeros to 0
      int i = 5;      // initialize the factor of 5 to 5
      while (n / i >= 1) {  // loop while there are still factors of 5 to count
          count += n / i;   // increment the count by the number of factors of 5
          i *= 5;           // move on to the next factor of 5
      }
      return count;  // return the total count of trailing zeros in n!
  }
}
