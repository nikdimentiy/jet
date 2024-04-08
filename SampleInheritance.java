/**
 * This program demonstrates inheritance in Java with a simple example of different types of employees.
 */

// Main class
public class SampleInheritance {
    public static void main(String[] args) {
        // Creating instances of different types of employees
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        // Calling the help method of the teacher
        emp1.help();
    }
}

// Abstract class Employee implementing Help interface
abstract class Employee implements Help {
    // Common method for all employees
    void sleep() {
        System.out.println("Employee sleeps");
    }

    // Abstract method to be implemented by subclasses
    abstract void work();
}

// Teacher class extending Employee
class Teacher extends Employee {
    @Override
    void work() {
        System.out.println("Teacher works and teaches humans");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps to understand new material");
    }
}

// Driver class extending Employee
class Driver extends Employee {
    @Override
    void work() {
        System.out.println("Driver works and drives passengers");
    }

    @Override
    public void help() {
        System.out.println("A driver can help customers learn a new city");
    }
}

// Doctor class extending Employee
class Doctor extends Employee {
    @Override
    void work() {
        System.out.println("Doctor works and heals customers");
    }

    @Override
    public void help() {
        System.out.println("A doctor can explain how to protect your health");
    }
}

// Help interface defining a help method
interface Help {
    void help();
}
