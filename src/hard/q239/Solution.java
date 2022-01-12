package hard.q239;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    // brute force
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        if(l == r) return nums;
        int[] out = new int[nums.length-k+1];
        int idx = 0;
        while(r < nums.length){
            int cur = Integer.MIN_VALUE;
            for(int i=l; i<=r; i++) {
                cur = Math.max(cur, nums[i]);
            }
            out[idx] = cur;
            l++;
            r++;
            idx++;
        }
        return out;
    }

    // using deque
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int[] out = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int idx = 0;
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[i]);
        }
        out[idx] = deque.peek();
        for (int i = k; i < nums.length; i++) {
            idx++;
            if (!deque.isEmpty() && nums[i - k] == deque.peek()) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[i]);
            out[idx] = deque.peek();
        }
        return out;
    }
}

