// java code: cycle - do - while
public class DoWhileContinue {

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (true) continue;

            System.out.println("This line will not be executed");
        } while (counter < 3);

        System.out.println("Generated " + counter + " iteration!");
    }
}

