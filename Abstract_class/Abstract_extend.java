
abstract class AbstractClassA {
    public abstract void operationA();
}


abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}


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
        AbstractClassA instance = new ConcreteClass();

        instance.operationA();

    }
}
