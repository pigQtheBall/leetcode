package easy.q67;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry==1){
            int sum = ((i>=0) ? a.charAt(i)-'0' : 0) + ((j>=0) ? b.charAt(j)-'0' : 0) + carry;
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
