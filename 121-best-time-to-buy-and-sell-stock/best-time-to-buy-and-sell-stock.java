class Solution {
    public int maxProfit(int[] prices) {

        // 1. Guard clause for empty or null arrays
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        // 2. Start loop from index 1 since index 0 is already handled
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else { 
                
                // 3. Only calculate profit if it's not a new minimum day
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
