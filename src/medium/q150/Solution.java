package medium.q150;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        // use a stack, when we meet numbers, we push it onto the stack
        // when we meet an operator, we pop the stack twice and do the calculation
        // we push back the result onto the stack
        Stack<Integer> s = new Stack<Integer>();
        for (String el: tokens) {
            try {
                int cur = Integer.parseInt(el);
                s.push(cur);
            } catch (Exception e) {
                int operand2 = s.pop();
                int operand1 = s.pop();
                switch (el.charAt(0)) {
                    // *
                    case 42:
                        s.push(operand1 * operand2);
                        break;
                    // +
                    case 43:
                        s.push(operand1 + operand2);
                        break;
                    // -
                    case 45:
                        s.push(operand1 - operand2);
                        break;
                    // /
                    case 47:
                        s.push(operand1 / operand2);
                        break;
                }
            }
        }
        return s.pop();
    }
}
