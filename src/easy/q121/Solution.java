package easy.q121;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i,j;
        for (i = 0; i < prices.length; i++) {
            for (j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                max = diff > max ? diff : max;
            }
        }
        return max;
    }

    public int maxProfit3(int [] prices) {
        int max = 0;
        int i, j;
        for (i = prices.length - 1; i >= 0; i--) { // buy
            for (j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                max = diff > max ? diff : max;
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
//        [10000, 6, 5]
//        2^31 - 1
        int min = Integer.MAX_VALUE;
        int res = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            int diff = prices[i] - min;
            if (diff > 0) {
                res = diff > res ? diff : res;
            }
            min = prices[i] < min ? prices[i] : min;
        }
        return res;
    }

    public int maxProfit4(int[] prices) {
//        [10000, 6, 5]
//        2^31 - 1
        int min = prices[0];
        int res = 0;
        int i;
        for (i = 1; i < prices.length; i++) {
            int diff = prices[i] - min;
            if (diff > 0) {
                res = diff > res ? diff : res;
            }
            min = prices[i] < min ? prices[i] : min;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.maxProfit2(new int[]{10000, 6, 5});
        System.out.println(res);
    }
}
