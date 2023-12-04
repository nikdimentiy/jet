/**
 * The Hobbit class represents a simple program that creates an array of Hobbit objects
 * and assigns names to them. It then prints out the names along with a message.
 */
public class Hobbit {
    // Instance variable to store the name of the hobbit
    String name;

    /**
     * The main method is the entry point of the program.
     * It creates an array of Hobbit objects, assigns names to them, and prints out the names.
     */
    public static void main(String[] args) {
        // Create an array of Hobbit objects with a length of 3
        Hobbit[] h = new Hobbit[3];
        // Variable to keep track of the index in the array
        int z = -1;

        // Loop through the array and assign names to the Hobbit objects
        while (z < 2) {
            // Increment the index
            z = z + 1;
            // Create a new Hobbit object at the current index
            h[z] = new Hobbit();
            // Assign the name "Bilbo" to the hobbit at index 0
            h[z].name = "Bilbo";
            // Change the name to "Frodo" if the index is 1
            if (z == 1) {
                h[z].name = "Frodo";
            }
            // Change the name to "Sam" if the index is 2
            if (z == 2) {
                h[z].name = "Sam";
            }
            // Print the hobbit's name and a message
            System.out.print(h[z].name + " - ");
            System.out.println("name of a nice hobbit!");
        }
    }
}
