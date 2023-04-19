// CodeWars task: solution --> https://www.codewars.com/kata/563b662a59afc2b5120000c6/java

package codewars;

class Arge {
	/**
	 * Returns the number of years required for a population to reach a certain
	 * size.
	 *
	 * @param p0      the initial population size
	 * @param percent the annual growth rate as a percentage
	 * @param aug     the annual change in population due to migration, birth, or
	 *                death
	 * @param p       the target population size to be reached or exceeded
	 * @return the number of years required for the population to reach or exceed
	 *         the target size
	 */
	public static int nbYear(int p0, double percent, int aug, int p) {
		int current_population = p0;
		int current_year = 0;
		while (current_population < p) {
			current_population += (int) (current_population * percent / 100) + aug;
			current_year++;
		}
		return current_year;
	}

	public static void main(String[] args) {
		// Test the function with sample inputs
		int years1 = nbYear(1500, 5, 100, 5000);
		System.out.println("Years required for population to reach 5000: " + years1); // Output: 15

		int years2 = nbYear(1500000, 2.5, 10000, 2000000);
		System.out.println("Years required for population to reach 2000000: " + years2); // Output: 10
	}
}
