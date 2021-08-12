/**
 * Upcast to Base class.
 */
public class InheritanceUpcast {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        // Casting an instance of the DerivedClass class to the base type BaseClass
        BaseClass newInstance = (BaseClass) instance; // Upcast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

        //System.out.println(newInstance.field4);
        //System.out.println(newInstance.field5);

        // Checking
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}

class DerivedClass extends BaseClass {
    public int field4;
    public int field5;
}

class BaseClass {
    public int field1;
    public int field2;
    public int field3;
}
