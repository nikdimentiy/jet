// Java program illustrating the implementation of a basic Queue class

class Queue {
    char[] q;         // Array to hold the queue elements
    int putloc, getloc;   // Index for putting and getting elements

    // Constructor to initialize the queue with a given size
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Method to put a character into the queue
    void put(char ch) {
        // Check if the queue is full
        if (putloc == q.length) {
            System.out.println("\n");
            System.out.println("The Queue is FULL!");
            return;
        }

        // Put the character into the queue and increment the put location
        q[putloc++] = ch;
    }

    // Method to get a character from the queue
    char get() {
        // Check if the queue is empty
        if (getloc == putloc) {
            System.out.println("🥜🥜🥜The Queue is empty🥜🥜🥜");
            return (char) 0;
        }

        // Get the character from the queue and increment the get location
        return q[getloc++];
    }
}

// Main class to demonstrate the usage of the Queue class
public class Main {

    public static void main(String[] args) {
        // Create two instances of the Queue class with different sizes
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        // Display a message indicating the usage of Queue for alphabet saving
        System.out.println("<---The usage Queue for alphabet saving--->");

        // Put characters A to Z into the bigQ queue
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // Display the contents of the bigQ queue
        System.out.print("The Queue content (BigQ): ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");

        // Display a message indicating the usage of SmallQ for fail generation
        System.out.println("Usage queue (SmallQ) for fail generation: ");

        // Attempt to put characters Z to V into the smallQ queue
        for (i = 0; i < 5; i++) {
            System.out.println("Attempt to saving: " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Display the contents of the smallQ queue
        System.out.println("The context of queue (SmallQ): ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }
    }
}
