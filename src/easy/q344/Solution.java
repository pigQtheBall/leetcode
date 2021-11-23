package easy.q344;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            swap(s, left, right);
            left++;
            right--;
        }
    }

    public void swap (char[] s, int l, int r){
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
    }
}
