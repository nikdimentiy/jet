// CodeWars task: solution -> https://www.codewars.com/kata/55aa075506463dac6600010d/java

public class SumSquaredDivisors {
	
	/**
	 * Returns a string representation of an array of subarrays containing numbers
	 * whose sum of squared divisors is itself a square.
	 *
	 * @param m the lower bound of the range of numbers to check
	 * @param n the upper bound of the range of numbers to check
	 * @return a string representation of an array of subarrays containing numbers
	 * whose sum of squared divisors is itself a square
	 */
	public static String listSquared(long m, long n) {
		StringBuilder resultBuilder = new StringBuilder("[");
		for (long i = m; i <= n; i++) {
			long sumOfSquaredDivisors = calculateSumOfSquaredDivisors(i);
			if (isPerfectSquare(sumOfSquaredDivisors)) {
				resultBuilder.append(String.format("[%d, %d], ", i, sumOfSquaredDivisors));
			}
		}
		if (resultBuilder.charAt(resultBuilder.length() - 1) == ' ') {
			resultBuilder.delete(resultBuilder.length() - 2, resultBuilder.length());
		}
		resultBuilder.append("]");
		return resultBuilder.toString();
	}
	
	/**
	 * Calculates the sum of the squared divisors of a given number.
	 *
	 * @param num the number whose sum of squared divisors to calculate
	 * @return the sum of the squared divisors of the given number
	 */
	private static long calculateSumOfSquaredDivisors(long num) {
		long sum = 0;
		for (long i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i * i;
				if (num / i != i) {
					sum += (num / i) * (num / i);
				}
			}
		}
		return sum;
	}
	
	/**
	 * Checks if a given number is a perfect square.
	 *
	 * @param num the number to check
	 * @return true if the given number is a perfect square, false otherwise
	 */
	private static boolean isPerfectSquare(long num) {
		long root = (long) Math.sqrt(num);
		return root * root == num;
	}
}
