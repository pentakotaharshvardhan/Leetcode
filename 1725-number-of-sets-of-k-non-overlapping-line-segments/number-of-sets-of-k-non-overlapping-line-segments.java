class Solution {
    public int numberOfSets(int n, int k) {
        int MOD=1000000007;
        long[][] memo=new long[n][k+1];
        for(int i=0;i<n;i++) memo[i][0]=1;
        for(int j=1;j<=k;j++){
            long sum=0;
            for(int i=1;i<n;i++){
                sum=(sum+memo[i-1][j-1])%MOD;
                memo[i][j]=(memo[i-1][j]+sum)%MOD;
            }
        }
        return (int)(memo[n-1][k]);
    }
}