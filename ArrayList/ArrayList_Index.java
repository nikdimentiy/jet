
import java.util.ArrayList;

public class ArrayList_index {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("name");
        arrayList.add("surname");

        arrayList.ensureCapacity(30);

        System.out.println(arrayList.size());

        System.out.println(arrayList.get(1));


        // System.out.println(arrayList.get(2));

        System.out.println(arrayList.indexOf("name"));

        System.out.println(arrayList.lastIndexOf("surname"));
    }
}
