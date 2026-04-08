class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell =0;
        int profit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < buy)
            {
                profit = Math.max(profit , Math.max(sell-buy,0));
                sell=0;
                buy = prices[i];
            }
            else 
            {
                sell = Math.max(sell,prices[i]);
            }
        }
        profit = Math.max(profit , Math.max(sell-buy,0));
        return profit;
    }
}
