
import java.util.ArrayList;

public class ArrayList_Index {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("name");
        arrayList.add("surname");
        
        // define capacity of List
        arrayList.ensureCapacity(30);
        
        // print List in this state
        System.out.println(arrayList.size());
        
        // get element by index
        System.out.println(arrayList.get(1));

        // IndexOutOfBoundException error 
        // System.out.println(arrayList.get(2));
        
        // get the index of the object 
        System.out.println(arrayList.indexOf("name"));

        System.out.println(arrayList.lastIndexOf("surname"));
    }
}
