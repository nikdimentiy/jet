// CodeWars task: solution -> https://www.codewars.com/kata/57f759bb664021a30300007d/java

public class Switch {
    /**
     * Switches the positions of 'a' and 'b' in the given string.
     * Leaves any 'c' characters untouched.
     *
     * @param x the input string to switch
     * @return the resulting string with 'a' and 'b' switched
     */
    public static String switcheroo(String x) {
        StringBuilder result = new StringBuilder(); // initialize a StringBuilder to build the resulting string
        for (char c : x.toCharArray()) { // iterate through each character in the input string
            if (c == 'a') { // if the character is 'a', append 'b' to the result string
                result.append('b');
            } else if (c == 'b') { // if the character is 'b', append 'a' to the result string
                result.append('a');
            } else { // otherwise, append the original character to the result string
                result.append(c);
            }
        }
        return result.toString(); // convert the StringBuilder to a String and return it
    }
}
