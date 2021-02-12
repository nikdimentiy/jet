// The Dijkstra cycle.
//
// When the Dijkstra loop is executed, the protected conditions are calculated in each iteration.
// If at least one of them is true, the corresponding protected command is executed, after which a new iteration begins
// (if several protected conditions are true, only one protected command is executed).
// If all the protected conditions are false, the loop ends.
// A Dijkstra loop with one guard condition and one guard
// command is essentially a normal loop with a precondition (a "while" loop).
// A loop consists of one or more branches (protected expressions),
// each of which is a pair of the guarding condition and the guarded team.

import java.util.Scanner;

public class DijkstraLoop {
    public static void main(String[] args) {
        char character;
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l': // 'l' - guard condition 1
                    System.out.println("Go left");    // guard command
                    continue;

                case 'r': // 'r' - guard condition 2
                    System.out.println("Go right");   // guard command
                    continue;
            }
            break;  // break cycle (loop).
        }
    }
}
