package easy.q20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        while(!stack.isEmpty()){
            for(int i=0; i<s.length();i++){
                char cur = s.charAt(i);
                if(cur == '(' || cur == '[' || cur == '{'){
                    stack.push(cur);
                }
                else{
                    if(stack.isEmpty()) return false;
                    if(cur == ')' && stack.pop() != '(') return false;
                    if(cur == ']' && stack.pop() != '[') return false;
                    if(cur == '}' && stack.pop() != '{') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
