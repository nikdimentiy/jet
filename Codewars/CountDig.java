// CodeWars task: solution -> https://www.codewars.com/kata/566fc12495810954b1000030/train/java

public class CountDig {
    
    /**
     * Returns the count of the given digit used in the squares of all numbers between 0 and n (inclusive).
     *
     * @param n the upper bound for the numbers to square
     * @param d the digit to count in the squares
     * @return the count of the given digit used in the squares of all numbers between 0 and n
     */
    public static int nbDig(int n, int d) {
        int count = 0;  // initialize the count to 0
        for (int i = 0; i <= n; i++) {  // loop over each number k between 0 and n
            int square = i * i;  // calculate the square of k
            String squareStr = String.valueOf(square);  // convert the square to a string
            for (int j = 0; j < squareStr.length(); j++) {  // loop over each digit in the square
                if (squareStr.charAt(j) == Character.forDigit(d, 10)) {  // if the digit matches d
                    count++;  // increment the count
                }
            }
        }
        return count;  // return the total count of d used in the squares of all numbers between 0 and n
    }
}
