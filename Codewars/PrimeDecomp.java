// CodeWars task: solution -> https://www.codewars.com/kata/54d512e62a5e54c96200019e/java

import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {
    
    /**
     * Returns the prime factorization of a positive integer as a string.
     * 
     * @param n the positive integer to be factorized
     * @return a string representing the prime factorization of n in the format "(p1**n1)(p2**n2)...(pk**nk)"
     */
    public static String factors(int n) {
        // Initialize an empty list to store the prime factors and their exponents.
        List<String> factors = new ArrayList<>();
        
        // Handle the special case of factorization by 2.
        int count;
        while (n % 2 == 0) {
            // Count the number of divisions by 2 and divide n accordingly.
            count = 1;
            n /= 2;
            while (n % 2 == 0) {
                count++;
                n /= 2;
            }
            // Append the prime factor and its exponent to the list.
            factors.add("2" + (count > 1 ? "**" + count : ""));
        }
        
        // Check odd prime factors up to the square root of n.
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                // Count the number of divisions by i and divide n accordingly.
                count = 1;
                n /= i;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                // Append the prime factor and its exponent to the list.
                factors.add(i + (count > 1 ? "**" + count : ""));
            }
        }
        
        // If n is greater than 2, it must be a prime factor.
        if (n > 2) {
            factors.add(Integer.toString(n));
        }
        
        // Join the list of prime factors and exponents into a string of the required format.
        return "(" + String.join(")(", factors) + ")";
    }
}
