
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List declaration
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you?");
        // adding by index
        System.out.println(arrayList);

        // adding elements by index
        arrayList.add(0, "teacher");


        arrayList.remove(1);

        // remove (delete) elements by value
        arrayList.remove("would you?");

        System.out.println(arrayList);
    }
}
