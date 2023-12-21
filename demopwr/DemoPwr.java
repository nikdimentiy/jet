/**
 * The DemoPwr class demonstrates the usage of the Pwr class for power calculations.
 */
public class DemoPwr {

    /**
     * The main method creates instances of the Pwr class and prints the results of power calculations.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create an instance of Pwr with base 4.0 and exponent 2
        Pwr x = new Pwr(4.0, 2);

        // Create an instance of Pwr with base 2.5 and exponent 1
        Pwr y = new Pwr(2.5, 1);

        // Create an instance of Pwr with base 5.7 and exponent 0
        Pwr z = new Pwr(5.7, 0);

        // Print the result of the power calculation for the first instance (x)
        System.out.println(x.b + " raised to the power " + x.e + " is " + x.get_pwr());

        // Print the result of the power calculation for the second instance (y)
        System.out.println(y.b + " raised to the power " + y.e + " is " + y.get_pwr());

        // Print the result of the power calculation for the third instance (z)
        System.out.println(z.b + " raised to the power " + z.e + " is " + z.get_pwr());
    }
}
