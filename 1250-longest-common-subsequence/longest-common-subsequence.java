class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            char ch1=text1.charAt(i);
            for(int j=0;j<m;j++){
                char ch2=text2.charAt(j);
                if(ch2==ch1) dp[i+1][j+1]=dp[i][j]+1;
                else dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[n][m];
    }
}