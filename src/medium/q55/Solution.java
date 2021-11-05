package medium.q55;

public class Solution {
    public boolean canJump(int[] nums) {
        // save the furthest index we can jump to
        int d = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > d) return false;
            d = Math.max(d, i + nums[i]);
            if(d >= nums.length-1) return true;
        }
        return true;
    }

}
