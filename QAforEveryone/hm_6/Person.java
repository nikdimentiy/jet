package hw_6; // This is the package declaration, specifying the package name for the class.

import java.util.Objects; // Importing the Objects class from the java.util package.

public class Person { // Defining the Person class.

    private String name; // Private member variable to store the person's name.
    private int age; // Private member variable to store the person's age.
    private String gender; // Private member variable to store the person's gender.

    // Constructor to initialize a Person object with a name, age, and gender.
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Setter method to set the person's name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the person's age.
    public int getAge() {
        return age;
    }

    // Setter method to set the person's age.
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method to retrieve the person's gender.
    public String getGender() {
        return gender;
    }

    // Setter method to set the person's gender.
    public void setGender(String gender) {
        this.gender = gender;
    }

    // This method prints a greeting based on the person's gender and name.
    public void getName() {
        if (Objects.equals(gender, "M")) {
            System.out.println("Hello Mr. " + name);
        } else {
            System.out.println("How it's going Ms. " + name);
        }
    }
}
