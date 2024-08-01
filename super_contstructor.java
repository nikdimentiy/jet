/**
 * Class A represents a base class that prints a message when an instance is created.
 */
class A {
    /**
     * Constructor for class A.
     * Prints a message indicating that a new instance of A has been created.
     */
    public A() {
        System.out.println("New A");
    }
}

/**
 * Class B is a subclass of A that prints a message when an instance is created.
 */
class B extends A {
    /**
     * Constructor for class B.
     * Calls the constructor of class A and then prints a message indicating that a new instance of B has been created.
     */
    public B() {
        super(); // Explicitly calling the constructor of the superclass A
        System.out.println("New B");
    }
}

/**
 * The Program class contains the main method to run the application.
 */
class Program {
    /**
     * The main method is the entry point of the application.
     * It creates an instance of class B, which will also create an instance of class A.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        B obj = new B(); // Creating an instance of B, which triggers the constructor chain
    }
}
