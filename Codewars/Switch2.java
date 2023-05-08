// CodeWars task: solution -> https://www.codewars.com/kata/57f759bb664021a30300007d/java

public class Switch {
    /**
     * Switches the positions of 'a' and 'b' in the given string.
     * Leaves any other characters untouched.
     *
     * @param x the input string to switch
     * @return the resulting string with 'a' and 'b' switched
     */
    public static String switcheroo(String x) {
        // Replace 'a' with '_' first to avoid overwriting any 'b' characters
        String temp = x.replace('a', '_');
        // Replace 'b' with 'a' and '_' with 'b' to switch their positions
        String result = temp.replace('b', 'a').replace('_', 'b');
        return result; // return the resulting string
    }
}
