package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class generates all permutations of length M of the first N natural numbers.
 */
public class Permutations {

    /**
     * Generate all permutations of length M of the first N natural numbers.
     *
     * @param N The number of natural numbers to consider.
     * @param M The length of the permutations to generate.
     * @param prefix The current prefix of the permutation.
     * @return A list of all permutations of length M of the first N natural numbers.
     */
    public static List<List<Integer>> generatePermutations(int N, int M, List<Integer> prefix) {
        /*
         * This comment describes the purpose of the method.
         */

        List<List<Integer>> permutations = new ArrayList<>();

        /*
         * This comment describes what the variable `permutations` stores.
         */

        if (M == 0) {
            /*
             * This comment describes the base case of the recursion.
             */
            permutations.add(new ArrayList<>(prefix));
            return permutations;
        }

        /*
         * This comment describes the recursive step of the algorithm.
         */
        for (int number = 1; number <= N; number++) {
            /*
             * This comment describes what the variable `number` stores.
             */
            if (prefix.contains(number)) {
                continue;
            }
            /*
             * This comment explains why we need to check if `number` is already in the prefix.
             */
            prefix.add(number);
            permutations.addAll(generatePermutations(N, M - 1, prefix));
            prefix.remove(prefix.size() - 1);
        }

        /*
         * This comment describes what the return value of the method represents.
         */
        return permutations;
    }

    /**
     * The main method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        /*
         * This comment describes the purpose of the main method.
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * This comment describes what the variable `scanner` stores.
         */
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        /*
         * This comment describes what the variable `N` stores.
         */
        System.out.print("Enter the number of positions: ");
        int M = scanner.nextInt();

        /*
         * This comment describes what the variable `M` stores.
         */
        List<List<Integer>> myPermutations;
        List<Integer> prefix = new ArrayList<>();

        /*
         * This comment describes what the variables `myPermutations` and `prefix` store.
         */
        myPermutations = generatePermutations(N, M, prefix);

        /*
         * This comment describes what the variable `myPermutations` stores after the execution of the `generatePermutations()` method.
         */
        for (List<Integer> permutation : myPermutations) {
            System.out.println(permutation);
        }

        /*
         * This comment describes what the loop does.
         */
        System.out.println("Total count of permutations: " + myPermutations.size());
    }
}
