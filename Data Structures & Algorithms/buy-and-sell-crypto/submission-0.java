class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int[] suffix = new int[prices.length];
        int n=prices.length;
        suffix[n-1]=0;
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(prices[i+1],suffix[i+1]);
        }
        for(int i=0;i<n;i++){
            int profit=suffix[i]-prices[i];
            maxprofit=Math.max(profit,maxprofit);

        }
        return maxprofit;

    }
}
