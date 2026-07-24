class Solution {
    public int maxProfit(int[] prices) {
       int buyPrice = prices[0];
       int currentProfit = -1;
       int maxProfit = -1;

       for(int i = 0; i < prices.length; i++ ){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
                
            }else{
                currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , currentProfit);
            }

            
       }

        if(maxProfit < 0){
            return 0;
        }
       return maxProfit;
    }
}