/**
 * This is the main class for demonstrating the use of the ConcreteDerivedClass.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of ConcreteDerivedClass
        ConcreteDerivedClass instance = new ConcreteDerivedClass();

        // Call the simpleMethod on the ConcreteDerivedClass instance.
        instance.simpleMethod();
        
        // Call the overriddenMethod on the ConcreteDerivedClass instance,
        // which overrides a method from the parent class.
        instance.overriddenMethod();
        
        // Call the abstractMethod on the ConcreteDerivedClass instance,
        // which is an implementation of an abstract method declared in the parent class.
        instance.abstractMethod();
    }
}
