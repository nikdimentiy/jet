public class TwoDimensionalArray {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // entering a number of values into an array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        // using a cycle (for-each) to sum up values
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("The value: " + y);
                sum += y;
            }
        }
        System.out.println("The total sum is: " + sum);
    }
}
