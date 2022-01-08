package easy.q20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> rec = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '[') rec.push(cur);
            else{
                if(rec.isEmpty()) return false;
                if(cur==')' && rec.pop() != '(') return false;
                if(cur=='}' && rec.pop() != '{') return false;
                if(cur==']' && rec.pop() != '[') return false;
            }
        }
        return rec.isEmpty();
    }
}
