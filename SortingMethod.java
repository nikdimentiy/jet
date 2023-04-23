public class SortingMethod {
    
    /**
     * Sorts an integer array using Insertion Sort algorithm in ascending order.
     *
     * @param array the input array to be sorted
     */
    public static void InsertSort(int[] array) {
        int a; // placeholder for swapping elements
        for (int i = 0; i < array.length; i++) {
            int min = array[i]; // assume i-th element is minimum
            int index = i; // keep track of index of minimum element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) { // if a smaller element is found
                    min = array[j]; // update the minimum value
                    index = j; // update the index of minimum element
                }
            }
            if (i != index) { // if the minimum element is different from the current element
                a = array[i]; // swap the current element with minimum element
                array[i] = min;
                array[index] = a;
            }
        }
    }

    public static void main(String[] args) {
        int[] array; // declare an integer array
        array = new int[]{5, 9, 1, -3, 0, 8, 2, 1, 2}; // initialize the array with values
        InsertSort(array); // sort the array using Insertion Sort
        for (int j : array) { // iterate over the sorted array
            System.out.print(j + " "); // print each element of the array
        }
    }
}
