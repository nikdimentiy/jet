import java.util.Scanner;

/**
 * This program calculates the largest hailstone sequence in a given range of numbers.
 * A hailstone sequence is a sequence of numbers obtained by repeatedly applying the following function to a starting number:
 * - if the number is even, divide it by 2
 * - if the number is odd, multiply it by 3 and add 1
 */
public class Hailstone {

    /**
     * Main method that prompts the user to enter the first and last candidates and calculates the largest hailstone sequence in the given range.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first candidate: ");
        int firstCandidate = scanner.nextInt();

        System.out.println("Enter the last candidate: ");
        int lastCandidate = scanner.nextInt();

        int highestSequenceLength = 0;
        int highestSequenceNumber = 0;

        // Iterate over the numbers in the given range
        for (int candidateNumber = firstCandidate; candidateNumber <= lastCandidate; candidateNumber++) {
            // Calculate the length of the hailstone sequence for the current number
            int sequenceLength = calculateHailstoneSequenceLength(candidateNumber);

            // If the current sequence length is greater than the highest sequence length seen so far, update the highest sequence length and highest sequence number
            if (sequenceLength > highestSequenceLength) {
                highestSequenceLength = sequenceLength;
                highestSequenceNumber = candidateNumber;
            }
        }

        // Print the result
        System.out.println("The longest hailstone sequence of length " + highestSequenceLength + " occurs at number " + highestSequenceNumber);
    }

    /**
     * Calculates the length of the hailstone sequence for a given number.
     * @param number The starting number for the hailstone sequence
     * @return The length of the hailstone sequence
     */
    public static int calculateHailstoneSequenceLength(int number) {
        int sequenceLength = 0;

        // Calculate the hailstone sequence for the given number
        while (number != 1) {
            if (number % 2 == 0) {
                // If the number is even, divide it by 2
                number = number / 2;
            } else {
                // If the number is odd, multiply it by 3 and add 1
                number = number * 3 + 1;
            }
            sequenceLength++; // Increment the sequence length for each step in the sequence
        }

        return sequenceLength;
    }
}

