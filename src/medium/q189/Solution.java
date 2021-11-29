package medium.q189;

public class Solution {
    // by reversing the array 3 times
    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // reverse the entire array
        reverse(nums, 0, n-1);
        // reverse the first k indices of the array
        reverse(nums, 0, k-1);
        // reverse the remaining part
        reverse(nums, k, n-1);
    }


    public void reverse(int[]nums, int l, int r){
        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }

    // 2nd try
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[(i+k)%n] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = res[i];
        }
    }

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
