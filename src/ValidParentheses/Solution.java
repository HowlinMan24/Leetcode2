package ValidParentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                characterStack.push(s.charAt(i));
            } else {
                if ((s.charAt(i) == ')' && characterStack.peek() == '(')) {
                    return false;
                } else if ((s.charAt(i) == ']' && characterStack.peek() == '[')) {
                    return false;
                } else if ((s.charAt(i) == '}' && characterStack.peek() == '{')) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
