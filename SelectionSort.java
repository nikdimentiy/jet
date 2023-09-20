// Selection Sort Method
class SelectionSort {
    // Method to perform selection sort on an array
    void sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_element = i;

            // Find the index of the minimum element in the remaining unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_element]) {
                    min_element = j;
                }
            }

            // Swap the minimum element with the current element (i)
            int temp = array[min_element];
            array[min_element] = array[i];
            array[i] = temp;
        }
    }

    // Method to print the elements of an array
    void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int array[] = {15, 10, 99, 53, 36};
        
        // Perform selection sort
        ob.sort(array);
        
        System.out.println("Sorted array:");
        
        // Print the sorted array
        ob.printArray(array);
    }
}
