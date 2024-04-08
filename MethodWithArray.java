/**
 * This class demonstrates a method that modifies an array by applying a modifier to each element.
 */
public class MethodWithArray {
    /**
     * Modifies the given array by multiplying each element by the specified modifier.
     *
     * @param array    The array to be modified.
     * @param modifier The value by which each element of the array will be multiplied.
     * @return The modified array.
     */
    static int[] modifyArray(int[] array, int modifier) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * modifier;
        }
        return array;
    }

    /**
     * Main method to demonstrate the usage of the modifyArray method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Original array
        int[] myArray = {1, 2, 3, 4, 5};

        // Modifying the array
        myArray = modifyArray(myArray, 5);

        // Printing the modified array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
