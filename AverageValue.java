// the programm calculate: min, max value of entered array, and average

import java.lang.*;

public class AverageValue {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int tempMax = arr[0];
        int tempMin = arr[0];
        int sum = 0;
        double averageValue;

        // method for sum of elements in an array
        for (int j : arr) {
            sum += j;
        }
        averageValue = (double) sum / arr.length;

        for (int j : arr) { // finding min value and index position
            if (j < tempMin) {
                tempMin = j;
            }
            if (j > tempMax) { // finding max value and index position
                tempMax = j;
            }
        }

        System.out.println("\n");

        System.out.println("Max value in generated array is: " + tempMax);
        System.out.println("Min value in generated array is: " + tempMin);
        System.out.format("The average value of entered array is: %.2f", averageValue);
    }
}
