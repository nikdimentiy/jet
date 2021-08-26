// sample of Inner class with call method

class MyClass {
    public class Inner {
        public void method() {
            System.out.println("Hello!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method();
    }
}
