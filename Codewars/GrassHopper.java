// Preparation for coding interview: CodeWars task: solution -> https://www.codewars.com/kata/55d24f55d7dd296eb9000030/java
// 🎯 Everything will be OK 🤞😎

package codewars;

//This class contains a method to calculate the summation of all positive integers up to a given number
public class GrassHopper {

	// This method takes an integer n as a parameter and returns the sum of all
	// positive integers from 1 to n
	public static int summation(int n) {
		// Initialize a variable to store the total sum
		int total = 0;
		// Loop through all positive integers from 1 to n
		for (int i = 1; i <= n; i++) {
			// Add the current integer to the total sum
			total += i;
		}
		// Return the final sum
		return total;
	}

	public static void main(String[] args) {
		// Test the summation method with example inputs
		System.out.println(summation(2)); // Output: 3 (1 + 2)
		System.out.println(summation(8)); // Output: 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
	}
}
