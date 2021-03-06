// the program calculates the largest sequence chain in a given range of numbers

import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, last, counter = -500, highestSequence = 0, highestNumber = 0, number = 0, sequence = 0;

        System.out.println("First candidate: ");
        first = scan.nextInt();

        System.out.println("Last candidate: ");
        last = scan.nextInt();

        for (int x = first; x <= last; x++) {
            number = x;
            counter = 1;

            while (number != 1) {
                if (number % 2 == 0) //even
                {
                    number = number / 2;
                } else //odd
                {
                    number = number * 3 + 1;
                }

                counter++; //counts sequence
            }
            if (counter > highestSequence) {
                highestSequence = counter;
                highestNumber = x;

                sequence = number;
            }

        }
        System.out.println("longest sequence of " + highestSequence + " occurs at " + highestNumber);
    }
}
