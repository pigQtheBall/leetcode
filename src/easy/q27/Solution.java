package easy.q27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int el : nums){
            if(el != val){
                nums[idx] = el;
                idx++;
            }
        }
        return idx;
    }
}
