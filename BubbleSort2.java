import java.util.Arrays;

class BubbleSort2 {

  /**
   * This method performs the bubble sort algorithm on the given array.
   *
   * @param array The array to be sorted using the bubble sort algorithm.
   */
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // Outer loop to iterate through each array element
    for (int i = 0; i < size - 1; i++) {
    
      // Inner loop to compare array elements
      for (int j = 0; j < size - i - 1; j++) {

        // Compare two adjacent elements
        // Change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // Swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // Call the bubbleSort method using class name
    BubbleSort2.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
