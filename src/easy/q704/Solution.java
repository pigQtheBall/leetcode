package easy.q704;

public class Solution {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length - 1]) return -1;
        int l = 0;
        int r = nums.length - 1;
        int mid = (l+r)/2;
        while(l<=r){
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) l = mid + 1;
            else r = mid - 1;
            mid = (l+r)/2;
        }
        return -1;
    }
}
