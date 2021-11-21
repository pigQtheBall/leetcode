package medium.q454;
import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // set a hashmap to store the sum of all combinations of nums1[i] + nums2[j]
        // key: the value of the sum, value: number of times this specific sum appears
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int sum12 = nums1[i] + nums2[j];
                if(map.containsKey(sum12)) map.put(sum12, map.get(sum12)+1);
                else map.put(sum12, 1);
            }
        }

        // loop through nums3 and nums4 to compute all combinations of their sum at each index
        // if the value of the sum (negative) appears in the hashmap already, then we know together with our current sum,
        // we have a total sum of 0
        // the number of time we can get an 0 result for this specific nums3[m]+nums4[n] is the value we stored in the map
        int res = 0;
        for(int m=0; m<nums3.length; m++){
            for(int n=0; n<nums4.length; n++){
                int sum34 = - (nums3[m] + nums4[n]);
                if(map.containsKey(sum34)) res += map.get(sum34);
            }
        }
        return res;
    }
}
