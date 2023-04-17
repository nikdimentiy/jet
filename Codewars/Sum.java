// CodeWars task: solution --> https://www.codewars.com/kata/55f2b110f61eb01779000053/java

public class Sum {
    /**
     * Returns the sum of all integers between and including the given values a and b.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of all integers between and including a and b.
     */
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        else if (a < b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        }
        else {
            int sum = 0;
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
