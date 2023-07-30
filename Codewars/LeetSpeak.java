// 🎯 Preparation to coding interview: CodeWars task -> solving: https://www.codewars.com/kata/57c1ab3949324c321600013f/java 😎

package codewars;
// Define a class named LeetSpeak
class LeetSpeak {
    // Define a static method named toLeetSpeak that takes a string as an argument and returns a string
    static String toLeetSpeak(final String speak) {
        // LeetSpeak alphabet mapping
        final char[] leetAlphabet = {
            '@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0',
            'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'
        };

        // Initialize a StringBuilder object to store the translated string
        StringBuilder leetText = new StringBuilder();
        // Loop through each character in the original string
        for (char c : speak.toCharArray()) {
            // Check if the character is an uppercase letter, otherwise, keep it as is
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                // Calculate the index of the character in the alphabet array by subtracting the ASCII value of 'A'
                int index = c - 'A';
                // Check if the index is valid and within the array length
                if (index >= 0 && index < leetAlphabet.length) {
                    // Append the corresponding LeetSpeak character to the StringBuilder object
                    leetText.append(leetAlphabet[index]);
                } else {
                    // If the character is not found in the alphabet array, keep it unchanged
                    leetText.append(c);
                }
            } else {
                // Keep non-uppercase letter characters unchanged
                leetText.append(c);
            }
        }

        // Return the translated string as a String object
        return leetText.toString();
    }

    // Define a main method to test the toLeetSpeak method
    public static void main(String[] args) {
        // Print some examples of LeetSpeak translation
        System.out.println(toLeetSpeak("LEET"));  // Output: "1337"
        System.out.println(toLeetSpeak("HELLO WORLD"));  // Output: "#3110 W0R1D"
        System.out.println(toLeetSpeak("I AM GROOT"));  // Output: "! @M 6R00T"
    }
}
