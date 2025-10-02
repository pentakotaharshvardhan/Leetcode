class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int left=numBottles;
        while(left>=numExchange){
            //System.out.println(left);
            ans+=1;
            left=left-numExchange+1;
            numExchange++;
        }
        //System.out.println(fill);
        return ans;
    }
}