// LeetCode task: solution -> https://leetcode.com/problems/valid-parentheses/

package practice;

import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.push(c);  // Push opening brackets onto the stack
            } else if (brackets.containsValue(c)) {
                if (stack.isEmpty()) {
                    return false;  // If stack is empty but a closing bracket is encountered, it is invalid
                }
                char openingBracket = stack.pop();  // Pop the top element from the stack
                if (brackets.get(openingBracket) != c) {
                    return false;  // If the closing bracket doesn't match the opening bracket, it is invalid
                }
            }
        }

        return stack.isEmpty();  // If the stack is empty, all opening brackets were closed properly
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String input1 = "([])";  // Valid string
        boolean isValid1 = solution.isValid(input1);
        System.out.println("Input: " + input1 + ", Is Valid: " + isValid1);

        String input2 = "{[()]()}";  // Valid string
        boolean isValid2 = solution.isValid(input2);
        System.out.println("Input: " + input2 + ", Is Valid: " + isValid2);

        String input3 = "([)]";  // Invalid string
        boolean isValid3 = solution.isValid(input3);
        System.out.println("Input: " + input3 + ", Is Valid: " + isValid3);
    }
}

