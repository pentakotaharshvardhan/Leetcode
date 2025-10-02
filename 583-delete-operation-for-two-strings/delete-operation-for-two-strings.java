class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            char ch1=word1.charAt(i);
            for(int j=0;j<m;j++){
                char ch2=word2.charAt(j);
                if(ch1==ch2) dp[i+1][j+1]=dp[i][j]+1;
                else dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return n+m-2*dp[n][m];
    }
}