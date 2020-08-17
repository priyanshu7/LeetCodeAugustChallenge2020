package august2020;

public class StocBuySellTwoTranx {
	
	public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0) return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        
        int minsofar = prices[0], maxsofar = prices[len-1];
        left[0] = 0;
        for(int i = 1; i < len; i++){
            if(prices[i] < minsofar){
                left[i] = left[i-1];
                minsofar = prices[i];
            }else{
                left[i] = ((prices[i] - minsofar) > left[i-1]) ? prices[i] - minsofar : left[i-1];
            }
        }
        
        right[len-1] = 0;
        for(int i = len -2 ; i >= 0; i--){
            if(prices[i] > maxsofar){
                right[i] = right[i+1];
                maxsofar = prices[i];
            }else{
                right[i] = ((maxsofar - prices[i]) > right[i+1]) ? maxsofar - prices[i] : right[i+1];
            }
        }
        
        int profit = Integer.MIN_VALUE;
        for(int i = 0; i < len ; i++){
            profit = Math.max(profit, right[i] + left[i]);
        }
        
        return profit;
    }

}
