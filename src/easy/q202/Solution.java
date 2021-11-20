package easy.q202;
import java.util.HashSet;

public class Solution {
    // Repeat the process until the number equals 1 (where it will stay),
    // or it * loops endlessly in a cycle * which does not include 1.
    // if it loops, then some number must appear repeatedly
    // ie, if any number appears more than once, return false
    // 笑掉大牙了这个solution！！！！
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        while(sum != 1){
            sum = 0;
            while(n > 0){
                int cur = n % 10;
                sum += cur * cur;
                n = n / 10;
            }
            if(set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
