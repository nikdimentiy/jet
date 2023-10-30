/**
 * This is an abstract base class that provides a template for derived classes.
 */
public abstract class AbstractBaseClass {

    /**
     * This is an abstract method that must be implemented by derived classes.
     */
    public abstract void abstractMethod();

    /**
     * This is a method that can be optionally overridden by derived classes.
     */
    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod();");
    }
}
