package EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stackNumbers = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a, b;
                switch (token) {
                    case "+" -> {
                        b = stackNumbers.pop();
                        a = stackNumbers.pop();
                        stackNumbers.push(a + b);
                    }
                    case "-" -> {
                        b = stackNumbers.pop();
                        a = stackNumbers.pop();
                        stackNumbers.push(a - b);
                    }
                    case "*" -> {
                        b = stackNumbers.pop();
                        a = stackNumbers.pop();
                        stackNumbers.push(a * b);
                    }
                    case "/" -> {
                        b = stackNumbers.pop();
                        a = stackNumbers.pop();
                        stackNumbers.push(a / b);
                    }
                }
            } else {
                stackNumbers.push(Integer.parseInt(token));
            }
        }
        return stackNumbers.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
