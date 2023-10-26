/**
 * The Swallow class is a subclass of the Bird class and represents a specific type of bird, the swallow.
 * Swallows are known for their flying abilities.
 */
package animal;

public class Swallow extends Bird {
    /**
     * Overrides the move() method to specify the Swallow's way of moving, which is flying.
     */
    @Override
    public void move() {
        System.out.println("I really like to fly!");
    }
}
