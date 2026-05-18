class Solution {
    public int maxProfit(int[] prices) {
        int pre=prices[prices.length-1];
        int ans=0;
        for(int i=prices.length-2;i>=0;i--){
            if(pre>=prices[i]){
                ans=Math.max(ans,pre-prices[i]); 
            }
            else{
                pre=prices[i];
            }
        }
        return ans;
    }
}