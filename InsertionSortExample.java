/**
 * InsertionSortExample is a class that demonstrates the insertion sort algorithm.
 * Insertion sort builds the final sorted array one element at a time, making it less
 * efficient on large lists compared to more advanced algorithms like quicksort, heapsort, or merge sort.
 */
public class InsertionSortExample {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String a[]) {
        int[] myArray = {860, 8, 200, 9};

        System.out.println("Before Insertion Sort");

        printArray(myArray);

        insertionSort(myArray); // Sorting array using insertion sort

        System.out.println("After Insertion Sort");

        printArray(myArray);
    }

    /**
     * This method implements the insertion sort algorithm to sort an array of integers in ascending order.
     *
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            System.out.println("Sort Pass Number " + (i));
            int key = arr[i];
            int j = i - 1;

            while ((j > -1) && (arr[j] > key)) {
                System.out.println("Comparing " + key + " and " + arr[j]);
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }
    }

    /**
     * This method prints the elements of an array.
     *
     * @param array The array to be printed.
     */
    static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
