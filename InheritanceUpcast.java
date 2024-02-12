/**
 * InheritanceUpcast demonstrates upcasting, where an instance of a derived class
 * is cast to its base class type. It also shows accessing fields of the base class
 * through the upcast reference.
 */
public class InheritanceUpcast {
    /**
     * The main method serves as the entry point for the program.
     * It creates an instance of DerivedClass, initializes its fields,
     * performs upcasting, and prints the fields of the upcast instance.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Create an instance of DerivedClass
        DerivedClass instance = new DerivedClass();

        // Initialize fields specific to DerivedClass
        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        // Initialize fields specific to DerivedClass
        instance.field4 = 4;
        instance.field5 = 5;

        // Upcast the instance to the base type BaseClass
        BaseClass newInstance = (BaseClass) instance; // Upcast

        // Access and print fields using the upcast reference
        System.out.println("BaseClass fields accessed through upcast:");
        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

        // Note: The fields specific to DerivedClass are not accessible through the upcast reference

        // Checking object identity using hashCode
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}

/**
 * DerivedClass extends BaseClass and includes additional fields.
 */
class DerivedClass extends BaseClass {
    public int field4;
    public int field5;
}

/**
 * BaseClass serves as the base class with common fields.
 */
class BaseClass {
    public int field1;
    public int field2;
    public int field3;
}
