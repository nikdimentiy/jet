// CodeWars task: solution -> https://www.codewars.com/kata/553ba31138239b9bc6000037/java

import java.util.*;

public class ChameleonUnity {
    /**
     * Calculates the maximum number of chameleons of a desired color that can be paired with
     * the same number of chameleons of two other colors.
     *
     * @param chameleons     an array representing the count of chameleons of each color
     * @param desiredColor   the index of the desired color (0, 1, or 2)
     * @return               the maximum number of chameleons that can be paired, or -1 if not possible
     */
    public static int Chameleon(int[] chameleons, int desiredColor) {
        int targetCount = chameleons[desiredColor];
        int a = chameleons[(desiredColor + 1) % 3];
        int b = chameleons[(desiredColor + 2) % 3];
        
        // If both a and b are 0 and the targetCount is also 0, or if (a - b) is not divisible by 3,
        // it means the desired number of chameleons cannot be paired with equal numbers of other colors.
        if ((Math.min(a, b) == 0 && targetCount == 0) || (a - b) % 3 != 0) {
            return -1;
        }
        
        // Returns the maximum count between a and b, as they represent the numbers of chameleons
        // that can be paired with the desired color.
        return Math.max(a, b);
    }
}
