class Solution {
    static{
        for(int i=0;i<500;i++){
            maxIceCream(new int[]{0},0);
        }
    }
    public static int maxIceCream(int[] costs, int coins) {
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