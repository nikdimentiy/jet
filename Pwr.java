/**
 * The Pwr class represents a simple power calculation utility.
 * It calculates the power of a given base to a given exponent.
 */
public class Pwr {
    // Instance variables
    private double base;
    private int exponent;
    private double value; // The result of the power calculation

    /**
     * Constructs a Pwr object with the specified base and exponent.
     *
     * @param base     the base of the power calculation
     * @param exponent the exponent of the power calculation
     */
    public Pwr(double base, int exponent) {
        this.base = base;
        this.exponent = exponent;

        // Initialize the value to 1, as any number to the power of 0 is 1
        value = 1;

        // Perform the power calculation
        if (exponent == 0) {
            // If the exponent is 0, the result is always 1
            return;
        }
        for (; exponent > 0; exponent--) {
            // Multiply the base by itself 'exponent' times
            value *= base;
        }
    }

    /**
     * Returns the calculated power value.
     *
     * @return the result of the power calculation
     */
    public double getPower() {
        return value;
    }
}
