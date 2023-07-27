// Preparation for coding interview: CodeWars task -> solution: https://www.codewars.com/kata/547c71fdc5b2b38db1000098/java
package codewars;

public class NameMe {
    public String firstName; // The first name of the person.
    public String lastName; // The last name of the person.
    public String fullName; // The full name of the person (combination of first and last name).

    /**
     * Constructor to initialize the first name and last name of the person.
     *
     * @param first The first name of the person.
     * @param last The last name of the person.
     */
    public NameMe(String first, String last) {
        this.firstName = first; // Initialize the firstName property with the provided 'first' parameter.
        this.lastName = last; // Initialize the lastName property with the provided 'last' parameter.
        this.fullName = first + " " + last; // Combine first and last name to form the full name.
    }

    /**
     * Get the first name of the person.
     *
     * @return The first name of the person.
     */
    public String getFirstName() {
        return firstName; // Return the value of the firstName property.
    }

    /**
     * Get the last name of the person.
     *
     * @return The last name of the person.
     */
    public String getLastName() {
        return lastName; // Return the value of the lastName property.
    }

    /**
     * Get the full name of the person.
     *
     * @return The full name of the person.
     */
    public String getFullName() {
        return fullName; // Return the value of the fullName property.
    }

    public static void main(String[] args) {
        // Create a new instance of the NameMe class with first name "John" and last name "Doe".
        NameMe nameMe = new NameMe("John", "Doe");

        // Get the first name of the person and store it in the 'firstName' variable.
        String firstName = nameMe.getFirstName(); // Expected: John

        // Get the last name of the person and store it in the 'lastName' variable.
        String lastName = nameMe.getLastName();   // Expected: Doe

        // Get the full name of the person and store it in the 'fullName' variable.
        String fullName = nameMe.getFullName();   // Expected: John Doe

        // Print the values of the first name, last name, and full name.
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);
    }
}
