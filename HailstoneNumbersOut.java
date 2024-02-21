import java.util.*;

/**
 * The HailstoneNumbersOut class generates hailstone numbers for a given integer and
 * calculates the number of steps required to reduce the number to 1.
 */
class HailstoneNumbersOut {
    static int c;

    /**
     * Recursively generates hailstone numbers for the given integer and prints them.
     * Also calculates the number of steps required to reduce the number to 1.
     *
     * @param N The input integer for which hailstone numbers are generated.
     * @return The number of steps required to reduce the input integer to 1.
     */
    static int HailstoneNumbers(int N) {
        // Print the current hailstone number.
        System.out.print(N + " ");

        // Base case: N is initially 1.
        if (N == 1 && c == 0) {
            return c;
        }
        // Base case: N is reduced to 1.
        else if (N == 1 && c != 0) {
            c++;
            return c;
        }
        // If N is Even.
        else if (N % 2 == 0) {
            c++;
            // Recursively call HailstoneNumbers with N/2.
            HailstoneNumbers(N / 2);
        }
        // If N is Odd.
        else if (N % 2 != 0) {
            c++;
            // Recursively call HailstoneNumbers with 3*N + 1.
            HailstoneNumbers(3 * N + 1);
        }
        return c;
    }

    /**
     * The main method to demonstrate the generation of hailstone numbers and
     * display the number of steps required to reduce a given integer to 1.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initial value for the hailstone sequence.
        int N = 7;
        int x;

        // Generate Hailstone Numbers and get the number of steps.
        x = HailstoneNumbers(N);

        // Output: Number of Steps
        System.out.println();
        System.out.println("Number of Steps: " + x);
    }
}
