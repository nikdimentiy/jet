/**
 * The Strauss class is a subclass of the Bird class and represents a specific type of bird, the Strauss.
 * Strausses are known for their running abilities.
 */
package animal;

public class Strauss extends Bird {
    /**
     * Overrides the move() method to specify the Strauss's way of moving, which is running.
     */
    public void move() {
        System.out.println("I like to run!");
    }
}
