// CodeWars task: solution --> https://www.codewars.com/kata/584c7b1e2cb5e1a727000047/java

public class HelloWorld {
    /**
     * Generates the "Hello, World!" string.
     *
     * @return The "Hello, World!" string.
     */
    public static String helloWorld() {
        // Define individual character strings
        String H = new String(new char[] {72});
        String e = new String(new char[] {101});
        String l1 = new String(new char[] {108});
        String l2 = new String(new char[] {108});
        String o = new String(new char[] {111});
        String comma = new String(new char[] {44});
        String space = new String(new char[] {32});
        String W = new String(new char[] {87});
        String r = new String(new char[] {114});
        String d = new String(new char[] {100});
        String exclamation = new String(new char[] {33});

        // Concatenate individual character strings to form "Hello, World!" string
        return H + e + l1 + l2 + o + comma + space + W + o + r + l1 + d + exclamation;
    }

    public static void main(String[] args) {
        // Call the helloWorld function and print the result
        String result = helloWorld();
        System.out.println(result);
    }
}

