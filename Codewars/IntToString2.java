// CodeWars task: solution -> https://www.codewars.com/kata/5265326f5fda8eb1160004c8/java

// A class to convert an integer to a string
class IntToString2 {
  // A method that takes an integer as a parameter and returns a string representation of it
  public static String numberToString(int num) {
    // Concatenate the integer with an empty string and return the result
    return ""+num;
  }
  
  // A driver code to test the method
  public static void main(String[] args) {
    // Create some test cases
    int[] testCases = {0, 5, -10, 100};
    // Loop through the test cases and print the output of the method
    for (int num : testCases) {
      System.out.println("numberToString(" + num + ") = " + numberToString(num));
    }
  }
}
