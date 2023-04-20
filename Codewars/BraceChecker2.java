import java.util.Stack;

/**
 * A class that checks if a given string of braces is valid.
 */
public class BraceChecker2 {

    /**
     * Determines if a given string of braces is valid.
     * 
     * @param braces the string of braces to check
     * @return true if the braces are valid, false otherwise
     */
    public boolean isValid(String braces) { 
        String b = braces;
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if(b.length() == 0)
                return true;
        }
        return false;
    }

    /**
     * A simple driver program to test the BraceChecker2 class.
     */
    public static void main(String[] args) {
        String[] testCases = {"(){}[]", "([{}])", "(}", "[(])", "[({})](]"};
        BraceChecker2 checker = new BraceChecker2();
        for(String s : testCases) {
            System.out.printf("%s: %s%n", s, checker.isValid(s));
        }
    }
}
