// CodeWars kata: solution --> https://www.codewars.com/kata/584c7b1e2cb5e1a727000047/java

public class HelloWorld2 {
    /**
     * Returns the string "Hello, World!".
     *
     * @return the string "Hello, World!"
     */
    public static String helloWorld() {
        // Create a char array with the ASCII codes for each character in "Hello, World!"
        char num[] = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33 };

        // Initialize a null string to concatenate each character
        String str = null;

        // Loop through each character in the char array
        for (char i : num) {
            // If the string is null, initialize it with the first character
            if (str == null) { 
                str = str.valueOf(i); 
            }
            // Otherwise, concatenate the next character to the existing string
            else {
                str += str.valueOf(i);
            }
        }

        // Return the final string
        return str;
    }
}
