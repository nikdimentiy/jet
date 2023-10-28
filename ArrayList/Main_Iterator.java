import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main_Iterator {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some integers to the ArrayList
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        // Using Iterator to traverse the ArrayList
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            // Get the next element from the Iterator
            Integer integer = iterator.next();
            System.out.println("Using Iterator: " + integer);
        }

        // Using ListIterator to traverse the ArrayList in both directions
        ListIterator<Integer> listIterator = arrayList.listIterator();

        // Traverse in the forward direction using ListIterator
        System.out.println("Forward direction using ListIterator:");
        while (listIterator.hasNext()) {
            // Get the next element using ListIterator
            Integer integer = listIterator.next();
            System.out.println(integer);
        }

        // Traverse in the backward direction using ListIterator
        System.out.println("Backward direction using ListIterator:");
        while (listIterator.hasPrevious()) {
            // Get the previous element using ListIterator
            Integer integer = listIterator.previous();
            System.out.println(integer);
        }
    }
}
