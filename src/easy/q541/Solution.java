package easy.q541;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i += 2*k) {
            int left = i;
            int right = Math.min(i + k, s.length()) - 1;
            while (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public void swap (char[] s, int l, int r){
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
    }
}
