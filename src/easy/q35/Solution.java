package easy.q35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) return nums.length;
        if(target < nums[0]) return 0;
        int middle = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            middle = (left + right) / 2;
            if(target == nums[middle]) return middle;
            else if (target < nums[middle]) {
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return right+1;
    }
}
