package java_projects.converter;

/**
 * This class provides methods for converting measurements in feet and inches to
 * centimeters.
 */
public class ImperialConverter {

    /**
     * The main method demonstrates the usage of the convertToCentimeters methods.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Print the conversion of 5 feet, 8 inches to centimeters
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");

        // Print the conversion of 68 inches to centimeters
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    /**
     * Converts a measurement in feet and inches to centimeters.
     *
     * @param feet   The number of feet.
     * @param inches The number of inches.
     * @return The equivalent measurement in centimeters, or -1 if invalid input is
     *         provided.
     */
    public static double convertToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid input. Please provide valid values for feet and inches.");
            return -1; // Indicate invalid input
        }

        // Conversion factors for feet and inches to centimeters
        double centimetersInOneFoot = 30.48;
        double centimetersInOneInch = 2.54;

        // Calculate total centimeters by multiplying feet by centimeters per foot and
        // adding
        // inches multiplied by centimeters per inch
        double totalCentimeters = feet * centimetersInOneFoot + inches * centimetersInOneInch;
        return totalCentimeters;
    }

    /**
     * Converts a measurement in inches to centimeters.
     *
     * @param inches The number of inches.
     * @return The equivalent measurement in centimeters, or -1 if invalid input is
     *         provided.
     */
    public static double convertToCentimeters(int inches) {
        if (inches < 0) {
            System.out.println("Invalid input. Please provide a valid value for inches.");
            return -1; // Indicate invalid input
        }

        // Conversion factor for inches to centimeters
        double centimetersInOneInch = 2.54;

        // Calculate total centimeters by multiplying inches by centimeters per inch
        double totalCentimeters = inches * centimetersInOneInch;
        return totalCentimeters;
    }
}
