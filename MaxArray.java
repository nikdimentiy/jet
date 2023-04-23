public class MaxArray {
    /**
     * This program finds the maximum element in an integer array.
     * It prints the maximum value of the array to the console.
     */
    public static void main(String[] args) {
        // creating an array of integer elements
        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        // creating an integer variable "max" and entering a number in it,
        // which is contained in the null index of the array "list"
        int max = list[0];

        // loop through the array starting from the second element
        for (int i = 1; i < list.length; i++) {
            // if current element is greater than current maximum, update maximum
            if (list[i] > max)
                max = list[i];
        }

        // print the maximum value
        System.out.println("Max is " + max);
    }
}
