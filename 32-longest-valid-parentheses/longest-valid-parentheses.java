import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index to act as a boundary
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Store the index of '('
            } else {
                stack.pop(); // Pop the matching '(' or boundary
                
                if (stack.isEmpty()) {
                    // Current ')' is unmatched; push its index as the new boundary
                    stack.push(i);
                } else {
                    // Valid substring found, calculate its length
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
