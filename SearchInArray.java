/**
 * This program demonstrates searching for a value in an array using an enhanced loop (for-each).
 */
class SearchInArray {
    public static void main(String[] args) {
        // Array containing integer values
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        // Value to search for in the array
        int val = 5;
        // Flag to indicate if the value is found in the array
        boolean found = false;

        // Using for-each loop to iterate through each element of the array
        for (int x : nums) {
            // Checking if the current element matches the value being searched for
            if (x == val) {
                // If a match is found, set the 'found' flag to true and exit the loop
                found = true;
                break;
            }
        }
        
        // If the value is found, print a message
        if (found) {
            System.out.println("The value is found!");
        }
    }
}
