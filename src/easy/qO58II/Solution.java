package easy.qO58II;

public class Solution {
    // combining ideas from Q151
    // ie, reverse an interval of indices on the string 翻转string的一部分
    public String reverseLeftWords2(String s, int n) {
        int idx = n;
        StringBuilder res = new StringBuilder(s);
        // reverse first n indices of words
        reverseInterval(res, 0, n-1);
        // reverse indices from n to last
        reverseInterval(res, n, s.length()-1);
        // reverse the entire string
        reverseInterval(res, 0, s.length()-1);
        return res.toString();
    }

    public void reverseInterval(StringBuilder s, int start, int end){
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

    // my thoughts
    public String reverseLeftWords(String s, int n) {
        int idx = n;
        StringBuilder res = new StringBuilder();
        while(idx < s.length()){
            res.append(s.charAt(idx));
            idx++;
        }
        for(int i =0; i<n; i++) res.append(s.charAt(i));
        return res.toString();
    }
}
