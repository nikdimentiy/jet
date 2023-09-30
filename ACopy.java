// filling array and coping operation into another array

class ACopy {
    public void main(int[] nums1, int[] nums2) {
        /**
         * This function copies the elements of array nums1 to array nums2.
         * @param nums1: array of integers
         * @param nums2: array of integers
         */
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }
        // Copy array nums1 to array nums2
        if (nums2.length >= nums1.length) {
            for (int i = 0; i < nums2.length; i++) {
                nums2[i] = nums1[i];
            }
            for (int i = 0; i < nums2.length; i++) {
                System.out.print(nums2[i] + " ");
            }
        }
    }
}
