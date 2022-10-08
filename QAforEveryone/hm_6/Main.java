package hw_6;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Employee alex = new Employee("Alex Rinovskiy", 42, "M", 2500.60);
        Employee alice = new Employee("Alice Tutova", 35, "F", 1746.90);
        Employee dymon = new Employee("Dymon Rabin", 37, "M", 2780.80);
        Employee lena = new Employee("Elena Rojnova", 32, "F", 2347.50);
        Employee maks = new Employee("Maksim Pataskin", 50, "M", 4501.20);

        employees[0] = alex;
        employees[1] = alice;
        employees[2] = dymon;
        employees[3] = lena;
        employees[4] = maks;

        System.out.println("--------------------------------------------------------");
        System.out.printf("The total sum of all salaries of employees is: %.2f\n", SalaryUtils.getSum(employees));
        System.out.println("--------------------------------------------------------");
        System.out.printf("The average salary is: %.2f", SalaryUtils.getAverage(employees));
    }
}
