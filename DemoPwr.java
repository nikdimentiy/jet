/**
 * This is a demonstration class for the Pwr class.
 * It creates instances of the Pwr class, calculates the power,
 * and prints the results for different base and exponent values.
 */
public class DemoPwr {

    /**
     * The main method to execute the demonstration.
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating instances of the Pwr class with different parameters
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        // Printing the result for the first instance (x)
        System.out.println(x.b + " in power " + x.e + " is " + x.get_pwr());
        
        // Printing the result for the second instance (y)
        System.out.println(y.b + " in power " + y.e + " is " + y.get_pwr());
        
        // Printing the result for the third instance (z)
        System.out.println(z.b + " in power " + z.e + " is " + z.get_pwr());
    }
}
