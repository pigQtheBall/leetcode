package easy.q67;

public class Solution {
    // 2nd try
    public String addBinary2(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        while(i >= 0 && j>=0){
            int da = a.charAt(i) - '0';
            int db = b.charAt(j) - '0';
            sum = da + db + carry;
            res.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        while(i>=0){
            int cur = a.charAt(i) - '0';
            sum = cur + carry;
            res.append(sum % 2);
            carry = sum / 2;
            i--;
        }
        while(j>=0){
            int cur = b.charAt(j) - '0';
            sum = cur + carry;
            res.append(sum % 2);
            carry = sum / 2;
            j--;
        }
        if(carry == 1) res.append('1');
        return res.reverse().toString();
    }

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
