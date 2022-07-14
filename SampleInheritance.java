// java program with an example of inheritance

public class SampleInheritance {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        emp1.help();
    }
}

abstract class Employee implements Help {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee {
    @Override
    void work() {
        System.out.println("Teacher works and teaching humans");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps to understand new material");
    }
}

class Driver extends Employee {
    @Override
    void work() {
        System.out.println("Driver works and drive passengers");
    }

    @Override
    public void help() {
        System.out.println("A driver can help customers learn new city");
    }
}

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

interface Help {
    void help();
}
