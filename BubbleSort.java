import java.util.Arrays;

// java practice
public class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int head, tail, temp;
        // show entered array
        System.out.print("Source array: ");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println("\n");

        // bubble sort --> realisation
        for (head = 1; head < nums.length; head++) {
            for (tail = nums.length - 1; tail >= head; tail--) {
                if (nums[tail - 1] > nums[tail]) {
                    temp = nums[tail - 1];
                    nums[tail - 1] = nums[tail];
                    nums[tail] = temp;
                }
            }
        }
        /* show sorted array */
        System.out.println("Sorted array: ");
//        for (int num : nums) System.out.print(" " + num);
        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}

