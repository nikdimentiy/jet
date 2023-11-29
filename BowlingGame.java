import java.util.*;

/**
 * The Bowling class represents a simple bowling game where players and their scores are stored.
 */
class Bowling {
    HashMap<String, Integer> players;

    // Constructor to initialize the HashMap
    Bowling() {
        players = new HashMap<String, Integer>();
    }

    /**
     * Adds a player with their score to the game.
     *
     * @param name   The name of the player.
     * @param points The score of the player.
     */
    public void addPlayer(String name, int points) {
        players.put(name, points);
    }

    /**
     * Determines and prints the winner of the game based on the highest score.
     */
    public void getWinner() {
        String best = "";
        Iterator<Map.Entry<String, Integer>> it = players.entrySet().iterator();
        int max = 0;

        while (it.hasNext()) {
            String playerName = it.next().getKey();
            Integer checkVal = players.get(playerName);

            if (checkVal >= max) {
                max = checkVal;
                best = playerName;
            }
        }

        System.out.println("Winner: " + best);
    }
}

/**
 * The BowlingGame class contains the main method to run the Bowling game.
 */
public class BowlingGame {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        // Allowing input for three players
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }

        // Displaying the winner of the game
        game.getWinner();
    }
}
