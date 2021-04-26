// filling array with method random, and represent max and min value (also position) in generated array

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100) - 5); // random filling: from - 5 by + 100
        }
        for (int j : arr) {
            System.out.print(j + "  "); // showing output array
        }

        int tempMax = arr[0];
        int tempMin = arr[0];
        int valueMax = 0;
        int valueMin = 0;

        for (int i = 0; i < arr.length; i++) { // finding min value and index position
            if (arr[i] < tempMin) {
                tempMin = arr[i];
                valueMin = i;
            }
            if (arr[i] > tempMax) { // finding max value and index position
                tempMax = arr[i];
                valueMax = i;
            }
        }
        System.out.println("\n");

        System.out.println("Max value in generated array is: " + tempMax);
        System.out.println("Min value in generated array is: " + tempMin);
        System.out.println("Max value index - position number: " + valueMax);
        System.out.println("Min value index - position number: " + valueMin);
    }
}
