package easy.q66;

public class Solution {
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
