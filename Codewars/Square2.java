// CodeWars task: solution -> https://www.codewars.com/kata/54c27a33fb7da0db0100040e/java

import static java.lang.Math.*;

public class Square {
    /**
     * Determines whether an integer is a perfect square by checking if its square root is an integer.
     *
     * @param n The integer to check.
     * @return True if the integer is a perfect square, false otherwise.
     */
    public static boolean isSquare(int n) {
        // Check if the square root of n is an integer.
        return Math.sqrt(n) % 1 == 0;
    }
}
