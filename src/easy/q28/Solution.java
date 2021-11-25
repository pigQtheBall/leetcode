package easy.q28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int n = haystack.length();
        int m = needle.length();

        // create next array for the given pattern(needle) string
        // ie, calculate the number of same prefix and suffix while looping through the pattern from left to right
        int[] next = new int[m];
        for(int i=1, j=0; i<m; i++){
            while(j>0 && needle.charAt(i)!=needle.charAt(j))
                j = next[j-1]; // 一直和前一位置的值比较，直到遇到相等的字符或者j=0；j通过next[j-1]来回退
            if(needle.charAt(i)==needle.charAt(j)) j++;
            next[i] = j;
        }

        // matching with given text string
        for(int i=0,j=0; i<n; i++){
            // 匹配不成功，needle指针j回退并继续比较
            while(j>0 && haystack.charAt(i)!=needle.charAt(j))
                j = next[j-1];
            if(haystack.charAt(i)==needle.charAt(j)) j++;
            if(j==m) return i - m + 1;
        }
        return -1;
    }
}
