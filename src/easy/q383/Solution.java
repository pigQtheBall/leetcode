package easy.q383;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for(int i=0; i<magazine.length(); i++){
            // if(map.containsKey(magazine.charAt(i))) map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            // else map.put(magazine.charAt(i), 1);
            alphabet[magazine.charAt(i)-'a']++;
        }
        for(int j=0; j<ransomNote.length(); j++){
            // if(!map.containsKey(ransomNote.charAt(j)) || map.get(ransomNote.charAt(j))<=0) return false;
            // map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j))-1);
            if(alphabet[ransomNote.charAt(j)-'a']<=0) return false;
            alphabet[ransomNote.charAt(j)-'a']--;
        }
        return true;
    }
}
