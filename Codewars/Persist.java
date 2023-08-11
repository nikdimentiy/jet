// Preparation for coding interview: CodeWars task: solution -> https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java

class Persist {
    /**
     * Calculates the multiplicative persistence of a given number.
     *
     * @param n The number for which to calculate the multiplicative persistence.
     * @return The multiplicative persistence of the given number.
     */
    public static int persistence(long n) {
        int persistenceCount = 0; // Initialize persistence count
        
        // Continue looping until the number becomes a single digit
        while (n >= 10) {
            long product = 1; // Initialize the product of digits
            
            // Multiply the digits of the number
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            
            n = product; // Update the number with the product
            persistenceCount++; // Increment persistence count
        }
        
        return persistenceCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(persistence(39));  // Output: 3
        System.out.println(persistence(999)); // Output: 4
        System.out.println(persistence(4));   // Output: 0
    }
}
