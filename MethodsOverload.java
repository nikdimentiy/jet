/**
 * The MethodsOverload class demonstrates the concept of method overloading
 * where methods can differ in type and number of arguments.
 */
public class MethodsOverload {

    /**
     * First overload: prints a generic greeting.
     */
    static void function() {
        System.out.println("Hello!");
    }

    /**
     * Second overload: prints the provided string.
     *
     * @param s A string to be printed.
     */
    static void function(String s) {
        System.out.println(s);
    }

    /**
     * Third overload: prints the provided integer.
     *
     * @param i An integer to be printed.
     */
    static void function(int i) {
        System.out.println(i);
    }

    /**
     * Fourth overload: prints the provided double value.
     *
     * @param d A double value to be printed.
     */
    static void function(double d) {
        System.out.println(d);
    }

    /**
     * Fifth overload: prints the concatenation of a string and an integer.
     *
     * @param s A string to be concatenated.
     * @param i An integer to be concatenated.
     */
    static void function(String s, int i) {
        System.out.println(s + i);
    }

    /**
     * Sixth overload: prints the concatenation of an integer and a string.
     *
     * @param i An integer to be concatenated.
     * @param s A string to be concatenated.
     */
    static void function(int i, String s) {
        System.out.println(i + s);
    }

    /**
     * The main method demonstrates the usage of the overloaded functions.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        function();                  // Invokes the first overload
        function("A");               // Invokes the second overload
        function(1);                 // Invokes the third overload
        function(3.14);              // Invokes the fourth overload
        function("B ", 2);           // Invokes the fifth overload
        function(3, " C");           // Invokes the sixth overload
    }
}
