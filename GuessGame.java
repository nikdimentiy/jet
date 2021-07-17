public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I have a secret number from 1 to 9....");

        while (true) {
            System.out.println("The number to guess - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("The first player thinks this number is: " + guessp1);

            guessp2 = p2.number;
            System.out.println("The second player thinks this number is: " + guessp2);

            guessp3 = p3.number;
            System.out.println("The third player thinks this number is: " + guessp3);

            System.out.println("\n");

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Did the first player guess? " + p1isRight);
                System.out.println("Did the second player guess? " + p2isRight);
                System.out.println("Did the third player guess? " + p3isRight);
                System.out.println("GAME OVER!");
                break;
            } else {
                System.out.println("Try one more time!");
            }

        }
    }
}

class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I think this number is: " + number);
    }
}

class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

