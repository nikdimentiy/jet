import java.util.Arrays;

public class BinarySearch {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() { }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param a the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return the index of the key in the array, or -1 if the key is not found
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0; // lower bound of the search range
        int hi = a.length - 1; // upper bound of the search range
        while (lo <= hi) { // continue searching while the search range is non-empty
            int mid = lo + (hi - lo) / 2; // find the middle index of the search range
            if      (key < a[mid]) hi = mid - 1; // the key is in the left half of the search range
            else if (key > a[mid]) lo = mid + 1; // the key is in the right half of the search range
            else return mid; // the key is found at the middle index
        }
        return -1; // the key is not found in the array
    }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param key the search key
     * @param a the array of integers, must be sorted in ascending order
     * @return the index of the key in the array, or -1 if the key is not found
     */
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    /**
     * Reads a sequence of integers from a file, sorts them, and prints any integer
     * that is not in the whitelist (stdin by default).
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(allowlist, key) == -1)
                StdOut.println(key);
        }
    }
}
