package medium.q347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        // key: numbers appeared in the given array, value: frequency
        HashMap<Integer, Integer> rec = new HashMap<>();
        for(int el : nums){
            if(!rec.containsKey(el)) rec.put(el, 1);
            else{
                int freq = rec.get(el);
                rec.put(el, freq+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = rec.entrySet();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}
