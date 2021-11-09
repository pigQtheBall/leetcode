package medium.q189;

public class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;
        int tmp = k%n;
        for(int i=0; i<n; i++){
            if(tmp>0) {
                res[i] = nums[n - tmp];
                tmp--;
            }else{
                res[i] = nums[idx];
                idx++;
            }
        }

        for(int j=0; j<n; j++){
            nums[j] = res[j];
        }
    }
}
