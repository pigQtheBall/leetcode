package medium.q151;

public class Solution {
    public String reverseWords(String s) {
        // first we remove the extra spaces in the given string
        StringBuilder std = removeSpaces(s);

        // secondly we reverse the entire string
        reverseEntire(std, 0, std.length()-1);

        // finally, we reverse each word in the string
        reverseEach(std);

        return std.toString();
    }

    public void reverseEach(StringBuilder s){
        int start = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                reverseEntire(s, start, i-1);
                start = i+1; // possible since after all the pre-process there is no space at the end of the string
            }
        }
        reverseEntire(s, start, s.length()-1);
    }

    public void reverseEntire(StringBuilder s, int start, int end){
        while(start < end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    public void swap(StringBuilder s, int start, int end){
        char tmp = s.charAt(start);
        s.setCharAt(start,s.charAt(end));
        s.setCharAt(end, tmp);
    }

    public StringBuilder removeSpaces(String s){
        // remove spaces at the beginning and end of the given string
        int start = 0;
        int end = s.length() - 1;
        while(s.charAt(start) == ' ') start++;
        while(s.charAt(end) == ' ') end--;

        StringBuilder res = new StringBuilder();
        while(start <= end){
            char cur = s.charAt(start);
            // remove duplicates of spaces in between words
            // we only append exactly one space ' ' in between words
            if(cur != ' ' || res.charAt(res.length()-1) != ' ') res.append(cur);
            start++;
        }
        return res;
    }

    // 以下是不动脑子的产物...
    public String reverseWords2(String s) {
        String[] splitStr = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = splitStr.length - 1; i>=0; i--){
            res.append(splitStr[i]);
            if(i>0) res.append(" ");
        }
        return res.toString();
    }
}
