package easy.q242;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        // an array storing all the counts for each letter occurring in the given strings
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            // if the letters of s and t are the same, then they're gonna cancel each other out
            count[s.charAt(i)-97]++;
            count[t.charAt(i)-97]--;
        }

        for (int el:count) {
            if (el != 0) return false;
        }
        return true;
     }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] s1 = new int[26];
        int[] t1 = new int[26];

        for(int i = 0; i < s.length(); i++){
            s1[s.charAt(i)-97]++;
            t1[t.charAt(i)-97]++;
        }

        if(Arrays.equals(s1,t1)) return true;

        return false;
    }

    public static void main (String[] args){
        String a = "ac";
        String b = "bb";
        System.out.println(isAnagram(a,b));




    }
}