package medium.q209;

public class Solution {
    // brute force
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum = nums[0];
        int subLength = 0;
        if (sum >= target) return 1;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if (sum >= target) {
                    subLength = j - i + 1;
                    res = Math.min(res, subLength);
                    break;
                }
            }
        }
        if(res == Integer.MAX_VALUE) res = 0;
        return res;
    }
}
