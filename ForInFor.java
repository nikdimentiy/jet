// A (for) loop nested in a (for) loop. ( Construction of a square of stars - * )
public class ForInFor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // Output one line of 9 stars
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            // go to the new line
            System.out.println();
        }
    }
}
