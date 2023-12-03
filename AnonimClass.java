package practice;

/**
 * An example demonstrating the use of anonymous classes in Java.
 * The program defines an interface with two methods, and then creates
 * two anonymous classes that implement this interface. Instances of
 * these anonymous classes are used to showcase their behavior.
 */
interface Interface {

    /**
     * A method to perform some action.
     */
    void method();

    /**
     * A method to retrieve a value.
     *
     * @return The value associated with the instance.
     */
    int getValue();
}

/**
 * The main class that contains the entry point for the program.
 */
public class AnonimClass {

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Anonymous (inner) class declaration for instance1
        Interface instance1 = new Interface() {
            int field = 0;

            @Override
            public void method() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        // Anonymous (inner) class declaration for instance2
        Interface instance2 = new Interface() {
            int field = -1;

            @Override
            public void method() {
                field = instance1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        // Invoking methods to demonstrate behavior
        instance2.method();
        instance1.method();

        // Displaying the values after method invocations
        System.out.println("instance1: field = " + instance1.getValue() +
                           "    instance2: field = " + instance2.getValue());
    }
}
