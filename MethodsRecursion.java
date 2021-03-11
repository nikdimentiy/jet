// recursion sample code
public class MethodsRecursion {

    // In the body of the recursion method, on the 15th line, the recursive method is called recursively.
    // Simple recursion is a method call to itself (self-call). Each time a new version of the method is built.

    static void recursion(int counter) {
        counter--;

        System.out.println("The first half of the method: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("The second half of the method " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}

