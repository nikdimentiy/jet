public class NotStaticConstructor {
    public static void main(String[] args) {
        // Option 1. (Only the Static constructor is called.)
        NotStaticClass.staticMethod();

        // Option 2. (Both Constructors are called.)
        // new NotStaticClass().notStaticMethod();
    }
}

class NotStaticClass {
    // Instance constructor, called only when the class is instantiated
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    // The static block is called anyway,
    // both when accessing a static member and when creating an instance of the classа.
    static {
        System.out.println("Static block.");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void notStaticMethod() {
        System.out.println("notStaticMethod");
    }
}
