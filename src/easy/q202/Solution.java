package easy.q202;
import java.util.HashSet;

public class Solution {
    // Repeat the process until the number equals 1 (where it will stay),
    // or it * loops endlessly in a cycle * which does not include 1.
    // if it loops, then some number must appear repeatedly
    // ie, if any number appears more than once, return false
    // 笑掉大牙了这个solution！！！！
    public boolean isHappy(int n) {
        String num = ""+n;
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        while(sum != 1){
            sum = 0;
            for(int i =0; i< num.length(); i++){
                int cur = num.charAt(i) - '0';
                sum += cur * cur;
            }
            if(set.contains(sum)) return false;
            set.add(sum);
            num = ""+sum;
        }
        return true;
    }
}
