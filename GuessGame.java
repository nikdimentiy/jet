public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();\n    }
}

public class GuessGame {
    private Player player1;
    private Player player2;
    private Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        while (true) {
            System.out.println("The number to guess is " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            int guessPlayer1 = player1.getNumber();
            System.out.println("Player 1 guessed " + guessPlayer1);

            int guessPlayer2 = player2.getNumber();
            System.out.println("Player 2 guessed " + guessPlayer2);

            int guessPlayer3 = player3.getNumber();
            System.out.println("Player 3 guessed " + guessPlayer3);

            if (guessPlayer1 == targetNumber) {
                player1IsRight = true;
            }

            if (guessPlayer2 == targetNumber) {
                player2IsRight = true;
            }

            if (guessPlayer3 == targetNumber) {
                player3IsRight = true;
            }

            if (player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right? " + player1IsRight);
                System.out.println("Player 2 got it right? " + player2IsRight);
                System.out.println("Player 3 got it right? " + player3IsRight);
                System.out.println("Game over.");
                break;
            }
            else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}

public class Player {
    private int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }

    public int getNumber() {
        return number;
    }
}
