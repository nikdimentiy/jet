// Java practice program

public class SortingMethod {
    public static void InsertSort(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
    }

    public static void main(String[] args) {
        int[] array;
        array = new int[]{5, 9, 1, -3, 0, 8, 2, 1, 2};
        InsertSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
