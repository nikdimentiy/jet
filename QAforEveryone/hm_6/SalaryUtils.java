package hw_6; // This is the package declaration, specifying the package name for the class.

public class SalaryUtils { // Defining the SalaryUtils class.

    // This static method calculates and returns the sum of salaries for an array of Employee objects.
    public static double getSum(Employee[] employeeArray) {
        double sum = 0; // Initialize a variable to store the sum of salaries.

        for (Employee employee : employeeArray) { // Iterate through the array of Employee objects.
            sum += employee.getSalary(); // Add the salary of each Employee to the sum.
        }

        return sum; // Return the total sum of salaries.
    }

    // This static method calculates and returns the average salary for an array of Employee objects.
    public static double getAverage(Employee[] employeeArray) {
        double averageSalary = 0; // Initialize a variable to store the average salary.

        for (Employee employee : employeeArray) { // Iterate through the array of Employee objects.
            averageSalary += employee.getSalary() / employeeArray.length; // Calculate the average salary.
        }

        return averageSalary; // Return the calculated average salary.
    }
}
