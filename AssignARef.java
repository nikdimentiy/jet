class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++) {
            nums1[i] = i;
        }

        for (i = 0; i < nums2.length; i++) {
            nums2[i] = -i;
        }
        System.out.print("Array nums1: ");
        for (i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Array nums2: ");
        for (i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        nums2 = nums1; // now, two links (variables) refer to array num1
        System.out.print("Array nums2 after assignment(refer): ");
        for (i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
            System.out.println();
        }

        // performing an array operation throught a variable
        nums2[3] = 99;

        System.out.print("Array nums1 after change through array nums2: ");
        for (i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
            System.out.println();
        }
    }
}