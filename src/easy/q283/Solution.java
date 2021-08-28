package easy.q283;

public class Solution {
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
