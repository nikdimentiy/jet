
abstract class AbstractClass {
    // Constructor (works out first). 
    public AbstractClass() {
        System.out.println("1 AbstractClass()");
        
        // The method implementation from the derived class is called - ConcreteClass 
        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    String s = "FIRST";

    // Constructor (works out second). 
    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Method realization: abstractMethod() v ConcreteClass  " + s);
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        System.out.println("-------------------------------");

        instance.abstractMethod();
    }
}
