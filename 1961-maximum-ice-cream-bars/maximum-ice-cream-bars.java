class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0;
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]) {
                coins-=costs[i];
                ans++;
            }
        }
        return ans;
    }
}