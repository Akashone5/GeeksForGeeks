class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int buy=prices[0];
        int sum=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                sum=sum+prices[i]-prices[i-1];
            }
        }
        return sum;
    }
}