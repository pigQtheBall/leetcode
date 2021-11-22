package medium.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // sort the given list first
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            // we now have the list in increasing order with the least number at first and largest number at last
            // if the smallest element itself is greater than 0 then there is no way for us to form a sum of 0 because all the following elements in the given array is greater than 0
            if (nums[i] > 0) {
                return result;
            }

            // remove duplicates by removing continuous number from i index
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) right--;
                else if (sum < 0) left++;
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // remove duplicates by removing continuous number from left and right index
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
