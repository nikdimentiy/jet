package animal;

/**
 * This is the main class that demonstrates the use of various bird objects.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of different bird types
        Bird s = new Strauss();
        Bird p = new Penguin();
        Bird sw = new Swallow();
        
        // Create an array to hold the bird objects
        Bird[] arr = {s, p, sw};
        
        // Iterate through the array and call the move method on each bird
        for (Bird temp : arr) {
            temp.move();
        }
    }
}

