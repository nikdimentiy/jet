/**
 * The Test class demonstrates the use of varargs (variable-length argument lists)
 * in the sum method to calculate the sum of integers.
 */
class Test {
    
    /**
     * Calculates the sum of integers passed as variable arguments.
     * @param a Variable-length argument list representing an array of integers.
     */
    static void sum(int... a) { // test of vararg - it's the array of arguments
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    /**
     * The main method where the sum method is tested with a few integer arguments.
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        sum(1, 8, 15); // equals sum(new int[]{1, 8, 15})
    }
}
