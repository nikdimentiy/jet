import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        // with the help of an iterator we can run through our list
        Iterator<Integer> iterator = arrayList.iterator();
        // ask if there is the next element in the list, if true, then the while body will be implemented
        while (iterator.hasNext()) {
            // move to the next element in the list and display it
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        // the same action, but through an optimized iterator for lists
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
