import java.util.Stack;

public class BraceChecker {
    /**
     * Checks if a string of braces is valid.
     * @param braces The string of braces to check.
     * @return true if the braces are valid, false otherwise.
     */
    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char brace : braces.toCharArray()) {
            if (brace == '(' || brace == '[' || brace == '{') {
                stack.push(brace);
            } else if (stack.isEmpty() || !matches(stack.pop(), brace)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * Checks if an opening brace and a closing brace match.
     * @param open The opening brace.
     * @param close The closing brace.
     * @return true if the opening and closing braces match, false otherwise.
     */
    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        BraceChecker checker = new BraceChecker();
        String[] testCases = {"(){}[]", "([{}])", "(}", "[(])", "[({})](]"};
        for (String testCase : testCases) {
            boolean isValid = checker.isValid(testCase);
            System.out.println(testCase + " : " + isValid);
        }
    }
}
