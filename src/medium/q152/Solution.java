package medium.q152;

public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int cur = 0;
        for(int i=0; i< nums.length; i++){
            if(cur < 0 && nums[i] < 0) cur = 0;
            cur *= nums[i];
            max = Math.max(max,cur);
        }
        return max;
    }
}
