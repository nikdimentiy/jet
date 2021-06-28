// search in the array using an extended loop (for) -> (for-each)

class SearchInArray {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        //using cycle (for-each) to find the value of a variable (val) in the array (nums)
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value is found!");
        }
    }
}
