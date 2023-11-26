/**
 * This program demonstrates the creation of an array, filling it with values,
 * and then displaying the values on the screen.
 */
public class ArraysFill {

    /**
     * The main method serves as the entry point of the program.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating an array of integer elements and filling it with the values 1, 2, 3, 4, 5
        int[] array = new int[]{1, 2, 3, 4, 5};

        // Displaying the values of the array elements
        System.out.println("Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
