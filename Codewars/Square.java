// CodeWars task: solution -> https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

public class Square {
    /**
     * Determines whether an integer is a perfect square.
     *
     * @param n The integer to check.
     * @return True if the integer is a perfect square, false otherwise.
     */
    public static boolean isSquare(int n) {
        // Check if the integer is negative.
        if (n < 0) {
            return false;
        }

        // Find the square root of the integer and check if it is an integer.
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
