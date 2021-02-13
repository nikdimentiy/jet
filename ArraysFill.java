// Filling in an array and displaying values on the screen

public class ArraysFill {

    public static void main(String[] args) {
        // creating an array of integer elements
        // and filling it with the values 1,2,3,4,5
        int[] array = new int[]{1, 2, 3, 4, 5};

        // Displays the values of the array elements
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
