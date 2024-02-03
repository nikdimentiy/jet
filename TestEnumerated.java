/**
 * Enumerated types (enum) with constructor and methods.
 * Represents different companies with associated values.
 */
enum Company {
    // Enum instances with associated values
    WEBCAMP(1000),
    GOOGLE(100),
    SKYNET(10);

    // Instance variable to store the associated value for each enum instance
    private final int value;

    // Private constructor for the enum instances
    private Company(int value) {
        this.value = value;
    }

    /**
     * Getter method to retrieve the associated value of the enum instance.
     *
     * @return The associated value of the enum instance.
     */
    public int getValue() {
        return value;
    }
}

/**
 * Test class for Enumerated types (enum) - Company.
 */
public class TestEnumerated {
    /**
     * The main method to demonstrate the usage of the Company enum.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Selecting a Company enum instance (WEBCAMP in this case)
        Company myComp = Company.WEBCAMP;

        // Displaying information about the selected company
        System.out.println("I work in a company " + myComp + " and I earn " + myComp.getValue() + "$ per month.");
    }
}
