package medium.q11;

public class Solution {
    public int maxArea(int[] height) {
        int dist = height.length - 1;
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left != right){
            int area = dist * Math.min(height[left], height[right]);
            if (area > max) max = area;
            if (height[left] > height[right]) right--;
            else left++;
        }
        return max;
    }
}
