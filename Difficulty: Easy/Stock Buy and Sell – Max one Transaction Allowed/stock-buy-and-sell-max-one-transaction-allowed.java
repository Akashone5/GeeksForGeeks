class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // code here
        int buy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
           buy=Math.min(buy,prices[i]);
           max=Math.max(max,prices[i]-buy);
        }
        return max;
    }
}