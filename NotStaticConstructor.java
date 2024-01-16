/**
 * This is a simple Java program that demonstrates the behavior of static and instance constructors in a class.
 */
public class NotStaticConstructor {

    /**
     * The main method serves as the entry point for the program.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Option 1. (Only the Static constructor is called.)
        NotStaticClass.staticMethod();

        // Option 2. (Both Constructors are called.)
        // new NotStaticClass().notStaticMethod();
    }
}

/**
 * This class contains a static block, an instance constructor, and two methods (one static and one non-static).
 */
class NotStaticClass {
    
    // Instance constructor, called only when the class is instantiated
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    // The static block is called anyway,
    // both when accessing a static member and when creating an instance of the class.
    static {
        System.out.println("Static block.");
    }

    /**
     * This static method is called from the main method in the NotStaticConstructor class.
     */
    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    /**
     * This non-static method is called when an instance of the NotStaticClass is created.
     */
    public void notStaticMethod() {
        System.out.println("notStaticMethod");
    }
}
