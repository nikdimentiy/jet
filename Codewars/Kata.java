import java.util.Arrays;
import java.util.Collections;

public class Kata {
    /**
     * Reverses each word in a string, while preserving the spaces.
     * 
     * @param original the input string to be reversed
     * @return the reversed string
     */
    @Override
    public static String reverseWords(final String original) {
        String[] words = original.split("(?<=\\s)|(?=\\s+)");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].matches("\\s+")) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join("", words);
    }
    
    public static void main(String[] args) {
        String original = "This is an example!";
        String reversed = Kata.reverseWords(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
