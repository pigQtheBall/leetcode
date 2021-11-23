package easy.qO05;

public class Solution {
    public String replaceSpace2(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append("%20");
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String replaceSpace(String s) {
        String res = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') res += "%20";
            else res += s.charAt(i);
        }
        return res;
    }
}
