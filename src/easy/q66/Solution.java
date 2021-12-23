package easy.q66;

public class Solution {
    // 3rd try
    public int[] plusOne3(int[] digits) {
        int n =digits.length;
        int last = digits[n - 1];
        if(last < 9){
            digits[n-1]++;
            return digits;
        }
        int i = 1;
        while( n-i >= 0 && digits[n-i] == 9){
            digits[n-i] = 0;
            i++;
        }
        if(n-i<0){
            int[] out = new int[n+1];
            out[0] = 1;
            return out;
        }
        digits[n-i]++;
        return digits;
    }

    // 2nd try
    public int[] plusOne2(int[] digits) {
        int n =digits.length;
        int last = digits[n - 1];
        // if we don't need to carry
        if(last != 9){
            digits[n-1]++;
            return digits;
        }
        // case when we have to deal with carry, but we don't need to carry it all the way to the first digit
        for(int i = n-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                continue;
            }
            digits[i]++;
            return digits;
        }
        // case when we have to carry all the way to the first digit
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int last = digits[n-1];
        if(last+1 < 10) {
            digits[n - 1] = last + 1;
            return digits;
        }

        for(int i = n-1; i<=0; i--){
            if(digits[i]==9) {
                digits[i] = 0;
                continue;
            }
            digits[i]++;
            return digits;

        }

        int[] result = new int[n+1];
        result[0] = 1;
        return result;

    }
}
