package hw_6;

public class Employee extends Person {
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
