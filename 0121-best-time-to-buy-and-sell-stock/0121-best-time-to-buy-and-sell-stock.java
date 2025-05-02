class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int max_Profit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                max_Profit = Math.max(profit,max_Profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return max_Profit;
    }
}