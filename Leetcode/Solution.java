package leetcode;

// LeetCode task: solution -> https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
// LeetCode ->  preparation for coding interview: 150 coding task

public class Solution {

    /**
     * Finds the first occurrence of the needle string in the haystack string.
     *
     * @param haystack The string to search.
     * @param needle   The string to find.
     * @return The index of the first occurrence of the needle string in the haystack string, or -1 if the needle string is not found.
     */
    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    // Driven code

    public static void main(String[] args) {

        String haystack = "hello world";
        String needle = "world";

        int index = strStr(haystack, needle);

        if (index == -1) {
            System.out.println("The needle string was not found.");
        } else {
            System.out.println("The needle string was found at index " + index);
        }

    }

}
