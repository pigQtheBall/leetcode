package easy.q53;

public class Solution {
    // O(N^3)
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += nums[k];
                    max = Math.max(max,sum);
                }
            }
        }
        return max;
    }

    // O(N^2)
    public int maxSubArray2(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            int curSum = nums[i];
            for(int j=i+1; j<nums.length; j++){
                curSum += nums[j];
                max = Math.max(max, curSum);
                max = Math.max(max,nums[j]);
            }
        }
        return max;
    }

    // O(N)
    public int maxSubArray3(int[] nums){
        int max = nums[0];
        int curSum = 0;
        for(int i=0; i< nums.length; i++){
            if(curSum < 0) curSum = 0;
            curSum += nums[i];
            max = Math.max(max,curSum);
        }
        return max;
    }
}
