/**
 * This class demonstrates method overloading with the main method.
 */
public class MethodsMainOverload {
    /**
     * This is the main method that accepts command-line arguments.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Checking if command-line arguments are provided
        if (args.length > 0) {
            // If arguments are provided, print the first argument
            System.out.println(args[0]);
        } else {
            // If no arguments are provided, call the overloaded main method without arguments
            main();
        }
    }

    /**
     * This is an overloaded main method without any parameters.
     * It is called when no command-line arguments are provided.
     */
    public static void main() {
        // Print a message indicating that it's the usual main method without arguments
        System.out.println("It's the usual main method without String[] args!");
    }
}
