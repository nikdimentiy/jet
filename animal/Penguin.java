/**
 * The Penguin class is a subclass of the Bird class and represents a specific type of bird, the penguin.
 * Penguins are known for their swimming abilities.
 */
package animal;

public class Penguin extends Bird {
    /**
     * Overrides the move() method to specify the penguin's way of moving, which is swimming.
     */
    @Override
    public void move() {
        System.out.println("I can swim!");
    }
}
