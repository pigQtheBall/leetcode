package easy.q122;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        while(i<prices.length-1){
            if(prices[i] < prices[i+1]) max += prices[i+1] - prices[i];
            i++;
        }

        return max;
    }
}

