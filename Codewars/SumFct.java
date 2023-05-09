// CodeWars task: solution -> https://www.codewars.com/kata/559a28007caad2ac4e000083/java

import java.math.BigInteger;

public class SumFct {
    /**
     * Calculates the sum of the perimeters of n + 1 squares arranged as in the drawing.
     * The length of the sides of the squares follows the Fibonacci sequence.
     * 
     * @param n the number of squares in the rectangle (n + 1 squares in total)
     * @return a BigInteger representing the sum of the perimeters of all the squares in the rectangle
     */
    public static BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO; // first number in the Fibonacci sequence
        BigInteger b = BigInteger.ONE; // second number in the Fibonacci sequence
        BigInteger c = BigInteger.ONE; // third number in the Fibonacci sequence
        BigInteger sum = BigInteger.ZERO; // sum of the first n numbers in the Fibonacci sequence
     
        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);      
        }
        
        return sum.multiply(BigInteger.valueOf(4)); // return the sum of the perimeters, multiplied by 4
    }
}
