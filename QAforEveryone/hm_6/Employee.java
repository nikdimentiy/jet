package hw_6;

public class Employee extends Person {
    // Declare a private instance variable 'salary' to store the salary of the employee.
    private double salary;

    // Constructor to initialize an Employee object with a name, age, gender, and salary.
    public Employee(String name, int age, String gender, double salary) {
        // Call the constructor of the superclass (Person) to set the name, age, and gender.
        super(name, age, gender);
        // Set the salary for this Employee instance.
        this.salary = salary;
    }

    // Setter method to set the salary for an Employee instance.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method to retrieve the salary of an Employee instance.
    public double getSalary() {
        return salary;
    }
}
