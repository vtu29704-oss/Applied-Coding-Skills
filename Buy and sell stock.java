class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            
            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}

Case 1:                     Case 2:

Input:                      Input:
prices = [7,1,5,3,6,4]      prices = [7,6,4,3,1]

Output:                     Output:
5                           0

Expected:                   Expected:
5                           0