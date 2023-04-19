package codewars

public class RockPaperScissors {
    /**
     * Determines the winner of a rock-paper-scissors game.
     *
     * @param p1 the choice of player 1 ("rock", "paper", or "scissors")
     * @param p2 the choice of player 2 ("rock", "paper", or "scissors")
     * @return the result of the game: either "Draw!" if the choices are the same,
     *         or "Player X won!", where X is the number of the winning player.
     */
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if ((p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    /**
     * A simple driver code to test the rps() method.
     */
    public static void main(String[] args) {
        String result1 = rps("rock", "scissors");
        System.out.println(result1); // Output: "Player 1 won!"

        String result2 = rps("paper", "paper");
        System.out.println(result2); // Output: "Draw!"
    }
}
