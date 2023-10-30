/**
 * This program demonstrates the use of abstract classes and their subclasses.
 */

// An abstract class AbstractClassA with an abstract method operationA.
abstract class AbstractClassA {
    public abstract void operationA();
}

// An abstract class AbstractClassB that extends AbstractClassA and adds an abstract method operationB.
abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}

// A concrete class ConcreteClass that extends AbstractClassB and provides implementations for both operationA and operationB.
class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");
    }
}

public class Abstract_extend {
    public static void main(String[] args) {
        // Create an instance of ConcreteClass and assign it to a reference of AbstractClassA.
        AbstractClassA instance = new ConcreteClass();

        // Call the operationA method on the instance.
        instance.operationA();
    }
}
