package practice;

// define a public class named EnumExample
public class EnumExample {
	// define an enum type named Month that has 12 constants for the months of the
	// year
	public enum Month {
		// each constant has an associated integer value that represents the number of
		// days in that month
		JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
		OCTOBER(31), NOVEMBER(30), DECEMBER(31);

		// declare a private final field named days to store the number of days for each
		// month
		private final int days;

		// define a constructor for the enum type that takes an integer parameter and
		// assigns it to the days field
		Month(int days) {
			this.days = days;
		}

		// define a public method named getDays that returns the value of the days field
		public int getDays() {
			return days;
		}

	}

	// define the main method that runs the program
	public static void main(String[] args) {
		// declare a variable of type Month and assign it the value of JANUARY
		Month month = Month.JANUARY;
		// print out the number of days in JANUARY using the getDays method
		System.out.println("Number of days in " + month + ": " + month.getDays());

		// assign the value of FEBRUARY to the month variable
		month = Month.FEBRUARY;
		// print out the number of days in FEBRUARY using the getDays method
		System.out.println("Number of days in " + month + ": " + month.getDays());

		// assign the value of MARCH to the month variable
		month = Month.MARCH;
		// print out the number of days in MARCH using the getDays method
		System.out.println("Number of days in " + month + ": " + month.getDays());
	}
}
