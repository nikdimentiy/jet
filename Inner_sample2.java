/**
 * MyClass is a sample class that contains an inner class, Inner.
 * It demonstrates the usage of an inner class with a static field.
 */
class MyClass {
    // Static field shared among all instances of MyClass and its inner classes
    private static int field = 0;

    /**
     * Inner is an inner class of MyClass.
     * It contains a method that sets the static field and prints its value.
     */
    public class Inner {
        /**
         * Sets the static field to the provided value and prints it.
         *
         * @param a The value to set the static field.
         */
        public void method(int a) {
            field = a;
            System.out.println("Field value set to: " + field);
        }
    }
}

/**
 * Main class serves as the driver code to test the MyClass and Inner classes.
 */
public class Main {

    /**
     * The main method creates an instance of Inner and tests its method.
     */
    public static void main(String[] args) {
        // Example 1: Create an instance of Inner and call its method
        MyClass.Inner instance1 = new MyClass().new Inner();
        instance1.method(3);

        // Example 2: Create another instance of Inner and call its method with a different value
        MyClass.Inner instance2 = new MyClass().new Inner();
        instance2.method(7);
    }
}
