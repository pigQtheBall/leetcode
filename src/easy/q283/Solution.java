package easy.q283;

public class Solution {
    // myself writing :)
    public void moveZeroes2(int[] nums){
        int i = 0;
        for(int j =0; j<nums.length; j++){
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int element:nums) {
            if(element != 0){
                nums[i] = element;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
