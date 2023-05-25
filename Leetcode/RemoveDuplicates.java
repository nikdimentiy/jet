// LeetCode task: solution -> https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0; // slow pointer to track the unique elements
        int fast = 1; // fast pointer to iterate through the array

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++; // increment slow pointer
                nums[slow] = nums[fast]; // update the next unique element
            }
            fast++; // increment fast pointer
        }

        return slow + 1; // return the number of unique elements
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int[] expectedNums1 = {1, 2};
        int k1 = removeDuplicates.removeDuplicates(nums1);
        System.out.println("k1 = " + k1);
        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
        System.out.println("Test case 1 passed");

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums2 = {0, 1, 2, 3, 4};
        int k2 = removeDuplicates.removeDuplicates(nums2);
        System.out.println("k2 = " + k2);
        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
        System.out.println("Test case 2 passed");

        // Additional test case
        int[] nums3 = {};
        int[] expectedNums3 = {};
        int k3 = removeDuplicates.removeDuplicates(nums3);
        System.out.println("k3 = " + k3);
        assert k3 == expectedNums3.length;
        for (int i = 0; i < k3; i++) {
            assert nums3[i] == expectedNums3[i];
        }
        System.out.println("Test case 3 passed");
    }
}
