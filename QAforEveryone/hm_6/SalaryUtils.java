package hw_6;

public class SalaryUtils {
    public static double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double getAverage(Employee[] employeeArray) {
        double averageSalary = 0;
        for (Employee employee : employeeArray) {
            averageSalary += employee.getSalary() / employeeArray.length;
        }
        return averageSalary;
    }
}
