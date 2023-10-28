// iterator sample code with ArrayList
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();

        // Populate the ArrayList with integers from 0 to 5
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }

        // Print the contents of the ArrayList
        System.out.println(list);

        // Initialize a variable to store the sum of elements in the ArrayList
        int sum = 0;

        // Create an Iterator to traverse the ArrayList
        Iterator<Integer> it = list.iterator();

        // Iterate through the ArrayList using the Iterator
        while (it.hasNext()) {
            // Get the next element from the Iterator and add it to the sum
            sum += it.next();
        }

        // Print the sum of elements in the ArrayList
        System.out.println(sum);
    }
}
