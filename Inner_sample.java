// Outer class definition
class MyClass {
    
    // Inner class definition
    public class Inner {
        
        /**
         * This method prints a greeting message.
         */
        public void method() {
            System.out.println("Hello!");
        }
    }
}

// Main class definition
public class Main {

    public static void main(String[] args) {
        
        // Create an instance of the Inner class using the outer class instance
        MyClass.Inner instance = new MyClass().new Inner();
        
        // Call the method of the Inner class
        instance.method();
    }
}
