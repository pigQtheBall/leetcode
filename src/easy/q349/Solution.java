package easy.q349;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] arr = new int[set2.size()];
        int j=0;
        for(int i:set2){
            arr[j++] = i;
        }
        return arr;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int el : nums1){
            if (set1.contains(el)) continue;
            set1.add(el);
        }
        for(int el : nums2){
            if (set2.contains(el)) continue;
            set2.add(el);
        }
        HashSet<Integer> res_set = new HashSet<Integer>();
        if(set1.size() <= set2.size()){
            for(int el : set1){
                if (set2.contains(el) && !res_set.contains(el)){
                    res_set.add(el);
                }
            }
        }
        else{
            for(int el : set2){
                if (set1.contains(el) && !res_set.contains(el)){
                    res_set.add(el);
                }
            }
        }
        int[] res = new int[res_set.size()];
        int i = 0;
        for(int el : res_set){
            res[i] = el;
            i++;
        }
        return res;


    }
}
