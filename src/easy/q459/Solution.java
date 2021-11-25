package easy.q459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // next[s.length()-1] represents the longest number of same prefix and suffix in the given string s
        // 如果len % (len - (next[len - 1])) == 0 ，则说明 (数组长度-最长相等前后缀的长度) 正好可以被 数组的长度整除，说明有该字符串有重复的子字符串。
        // 数组长度减去最长相同前后缀的长度相当于是第一个周期的长度，也就是一个周期的长度，如果这个周期可以被整除，就说明整个数组就是这个周期的循环。

        // create the next array on the given string s
        int m = s.length();
        int[] next = new int[m];
        for(int i=1, j=0; i<m; i++){
            while(j>0 && s.charAt(i) != s.charAt(j)){
                j = next[j-1];
            }
            if (s.charAt(i) == s.charAt(j)) j++;
            next[i] = j;
        }

        // longest number of same prefix and suffix in string s
        int longest = next[m-1];
        if(longest == 0) return false;
        int period = s.length() - longest;

        if(s.length() % period == 0) return true;
        return false;
    }
}
