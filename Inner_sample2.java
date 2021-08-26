// sample of Inner class with call method and initialization static field

class MyClass {
    private static int field = 0;
    public class Inner {
        public void method(int  a) {
            field = a;
            System.out.println(field);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method(3);
    }
}
