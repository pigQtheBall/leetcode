package easy.q415;

public class Solution {
    // 2nd try
    public String addStrings2(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int d1 = num1.charAt(i)-'0';
            int d2 = num2.charAt(j)-'0';
            int sum = d1 + d2 + carry;
            res.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i>=0){
            int cur = num1.charAt(i)-'0';
            int sum = cur + carry;
            res.append(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j>=0){
            int cur = num2.charAt(j)-'0';
            int sum = cur + carry;
            res.append(sum % 10);
            carry = sum / 10;
            j--;
        }
        if(carry == 1) res.append('1');
        return res.reverse().toString();
    }


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
