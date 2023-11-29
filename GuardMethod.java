/**
 * The GuardMethod class demonstrates the use of a guard clause to protect against a specific input value ("fool").
 */
public class GuardMethod {

    /**
     * Checks the input name and returns a sentence or an error message based on the guard clause.
     *
     * @param name The input name to be checked.
     * @return A sentence if the input is valid, an error message otherwise.
     */
    static String function(String name) {
        // Performing a check. When errors are detected, we shut down the work

        // Guard clause to check for a specific invalid input
        if ("fool".equals(name)) {
            return "You used an invalid word";
        }

        // Nominal version code

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    /**
     * The main method demonstrates the usage of the function with an example input.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example usage of the function
        String sentence = function("fool");

        System.out.println(sentence);
    }
}
