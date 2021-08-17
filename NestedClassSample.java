import java.lang.Math;

/**
 * Nested classes
 */
class MyClass extends BaseClass {
    public class Nested // No inheritance from BaseClass
    {
        public void methodFromNested() {
            System.out.println("Method Nested class.");
        }
    }
}

class BaseClass {
    public void methodFromBase() {
        System.out.println("Method Base class.");
    }
}

public class NestedClassSample {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Nested instance2 = new MyClass().new Nested();
        instance2.methodFromNested();
    }
}
