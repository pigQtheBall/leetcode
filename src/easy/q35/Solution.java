package easy.q35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        // when target is larger than all the element in nums
        // insert target at last
        if(target > nums[nums.length - 1]) return nums.length;
        // when target is smaller than all the elment in nums
        // insert target at the beginning of the array
        if(target < nums[0]) return 0;
        // binary search
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
