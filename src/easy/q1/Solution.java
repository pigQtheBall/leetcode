package easy.q1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        // key: numbers, value: index
        // key has to stand for numbers and value has to be index since we would use the map.get(Key) method to find
        // the index because what we want is the index as an output
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                output[1] = i;
                output[0] = map.get(target - numbers[i]);
                return output;
            }
            map.put(numbers[i], i);
        }
        return output;
    }
}