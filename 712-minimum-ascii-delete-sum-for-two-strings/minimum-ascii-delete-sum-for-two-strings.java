class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int tot = 0;
        for(int i =0; i<m; i++){
            tot+=(int)s1.charAt(i);
        }
        for(int i =0; i<n; i++){
            tot+=(int)s2.charAt(i);
        }
        int[][] dp = new  int[m+1][n+1];

        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i-1][j-1]+(int)s1.charAt(i-1), dp[i][j]);
                }
            }
        }
        // dp(s1,m,s2,n);
        return tot-2*dp[m][n];
    }

}