// Overloaded methods can differ in type and number of arguments

public class MethodsOverload {
    
    static void function() {                 // first overload
        System.out.println("Hello!");
    }

    static void function(String s) {        // second overload
        System.out.println(s);
    }

    static void function(int i) {           // third overload
        System.out.println(i);
    }

    static void function(double d) {        // fourth overload
        System.out.println(d);
    }

    static void function(String s, int i) { // fifth overload
        System.out.println(s + i);
    }

    static void function(int i, String s) { // sixth overload
        System.out.println(i + s);
    }


    public static void main(String[] args) {
        function();                  // first overload
        function("A");               // second overload
        function(1);                 // third overload
        function(3.14);              // fourth overload
        function("B ", 2);           // fifth overload
        function(3, " C");           // sixth overload
    }
}
