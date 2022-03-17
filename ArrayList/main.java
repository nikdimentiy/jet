
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you?");

        System.out.println(arrayList);


        arrayList.add(0, "teacher");


        arrayList.remove(1);


        arrayList.remove("would you?");

        System.out.println(arrayList);
    }
}
