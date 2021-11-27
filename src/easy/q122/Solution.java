package easy.q122;

public class Solution {
    public int maxProfit4(int[] prices) {
        if(prices.length == 1) return 0;
        int profit = Math.max(0, prices[1] - prices[0]);
        for(int i = 2; i<prices.length; i++){
            profit += Math.max(0, prices[i] - prices[i-1]);
        }
        return profit;
    }

    // second time solutions
    public int maxProfit3(int[] prices) {
        int profit = 0;
        for(int i =1; i<prices.length; i++){
            if (prices[i] >= prices[i-1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        int prev_price = prices[0];
        for(int i =1; i<prices.length; i++){
            if (prices[i] >= prev_price){
                profit += prices[i] - prev_price;
            }
            prev_price = prices[i];
        }
        return profit;
    }

    // first time solution
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

