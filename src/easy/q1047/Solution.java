package easy.q1047;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> rec = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(rec.isEmpty() || rec.peek() != cur) rec.push(cur);
            else rec.pop();
        }
        StringBuilder res = new StringBuilder();
        while(!rec.isEmpty()){
            res.append(rec.pop());
        }
        return new String(res.reverse());
    }
}
