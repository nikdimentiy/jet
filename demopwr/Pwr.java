/**
 * The Pwr class represents a simple power (exponentiation) calculation.
 * It allows calculating the result of raising a base to a specified exponent.
 */
public class Pwr {

    // Fields to store base, exponent, and the result of the power operation
    double b;
    int e;
    double val;

    /**
     * Constructor for the Pwr class.
     *
     * @param base The base value for the power operation.
     * @param exp  The exponent to which the base is raised.
     */
    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        // Initialize the result value to 1
        val = 1;

        // If the exponent is 0, the result is always 1, so return early
        if (exp == 0) return;

        // Calculate the power using a loop
        for (; exp > 0; exp--) {
            val = val * base;
        }
    }

    /**
     * Get the result of the power operation.
     *
     * @return The result of raising the base to the specified exponent.
     */
    double get_pwr() {
        return val;
    }
}
