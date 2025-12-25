class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        int n=happiness.length;
        Arrays.sort(happiness);
        int ixd=0;
        while(k>0){
            ans+=Math.max(0,happiness[n-ixd-1]-ixd);
            ixd++;
            k--;
        }
        return ans;
    }
    //42+1
}