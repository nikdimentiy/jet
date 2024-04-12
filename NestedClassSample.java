import java.lang.Math;

/**
 * This class demonstrates nested classes in Java.
 */
class MyClass extends BaseClass {
    /**
     * Nested class inside MyClass.
     * This class does not inherit from BaseClass.
     */
    public class Nested {
        /**
         * A method specific to the Nested class.
         */
        public void methodFromNested() {
            System.out.println("Method from Nested class.");
        }
    }
}

/**
 * Base class for MyClass.
 */
class BaseClass {
    /**
     * A method specific to the BaseClass.
     */
    public void methodFromBase() {
        System.out.println("Method from Base class.");
    }
}

/**
 * Main class to demonstrate nested classes.
 */
public class NestedClassSample {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass instance1 = new MyClass();

        // Calling method from BaseClass using instance of MyClass
        instance1.methodFromBase();

        // Creating an instance of Nested class using MyClass's instance
        MyClass.Nested instance2 = instance1.new Nested();

        // Calling method from Nested class
        instance2.methodFromNested();
    }
}
