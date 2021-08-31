package easy.q415;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry==1){
            int sum = ((i>=0) ? num1.charAt(i)-'0' : 0) + ((j>=0) ? num2.charAt(j)-'0' : 0) + carry;
            result.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return result.reverse().toString();

    }
}
