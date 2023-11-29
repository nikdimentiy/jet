/**
 * This class demonstrates the assignment of array references and the impact
 * of modifying an array through a variable referencing another array.
 */
public class AssignARef {

    public static void main(String[] args) {
        int i;

        // Creating two arrays of integers
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        // Initializing nums1 with values from 0 to 9
        for (i = 0; i < 10; i++) {
            nums1[i] = i;
        }

        // Initializing nums2 with negative values from 0 to -9
        for (i = 0; i < nums2.length; i++) {
            nums2[i] = -i;
        }

        // Displaying the contents of nums1 array
        System.out.print("Array nums1: ");
        for (i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Displaying the contents of nums2 array
        System.out.print("Array nums2: ");
        for (i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Assigning the reference of nums1 to nums2
        nums2 = nums1;

        // Displaying the contents of nums2 after assignment
        System.out.print("Array nums2 after assignment(refer): ");
        for (i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Modifying nums2, which also affects nums1
        nums2[3] = 99;

        // Displaying the contents of nums1 after modification through nums2
        System.out.print("Array nums1 after change through array nums2: ");
        for (i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}
