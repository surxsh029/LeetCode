class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max=0, minPrice = prices[0];
        for(int i=0; i<n; i++){
            if(prices[i] - minPrice > max) max = prices[i] - minPrice;
            if(minPrice > prices[i]) minPrice = prices[i];
        }

        return max;
    }
}