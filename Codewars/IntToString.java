// CodeWars task: solution -> https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

/**
 * Converts an integer to a string representation.
 *
 * @param number The integer to be converted.
 * @return The string representation of the integer.
 */
public static String intToString(int number) {
    return String.valueOf(number);
}

/**
 * Main driver code to test the intToString() function.
 */
public static void main(String[] args) {
    // Test cases
    int number1 = 123;
    int number2 = 999;
    int number3 = -100;

    // Convert integers to strings
    String string1 = intToString(number1);
    String string2 = intToString(number2);
    String string3 = intToString(number3);

    // Display the results
    System.out.println("Input: " + number1 + " --> Output: " + string1);
    System.out.println("Input: " + number2 + " --> Output: " + string2);
    System.out.println("Input: " + number3 + " --> Output: " + string3);
}
