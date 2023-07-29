// 🎯 Preparation for coding interview: CodeWars task -> solution: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/java
package codewars;

// This class contains methods for creating a complementary DNA strand from a given DNA strand.
public class DnaStrand {

    // This method takes a DNA strand as a string and returns its complementary strand as a string.
    // For example, if the input is "ATTGC", the output is "TAACG".
    // It uses a helper method called getComplementaryBase to find the complementary base for each base in the input strand.
    public static String makeComplement(String dna) {
        // Create a StringBuilder object to store the complementary strand.
        StringBuilder complementaryStrand = new StringBuilder();
        // Loop through each character (base) in the input string (strand).
        for (char base : dna.toCharArray()) {
            // Call the helper method to get the complementary base for the current base.
            char complementaryBase = getComplementaryBase(base);
            // Append the complementary base to the StringBuilder object.
            complementaryStrand.append(complementaryBase);
        }
        // Return the complementary strand as a string.
        return complementaryStrand.toString();
    }

    // This is a helper method that takes a base (char) as an input and returns its complementary base (char) as an output.
    // For example, if the input is 'A', the output is 'T'.
    // It uses a switch statement to match the input base with its complementary base.
    private static char getComplementaryBase(char base) {
        switch (base) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                // If an invalid character is encountered, you can throw an exception or handle it as you see fit.
                // For this exercise, I'll simply return the same character.
                return base;
        }
    }

    // Test examples
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));  // Output: "TAACG"
        System.out.println(makeComplement("GTAT"));   // Output: "CATA"
    }
}
