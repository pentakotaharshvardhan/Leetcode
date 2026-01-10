class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            dp[i][0]=(int)s1.charAt(i-1)+dp[i-1][0];
        }
        for(int i=1;i<=s2.length();i++){
            dp[0][i]=(int)s2.charAt(i-1)+dp[0][i-1];
        }
        // for(int i=1;i<=s2.length();i++){
        //     System.out.print(dp[0][i]+" ");
        // }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                Integer ch1=(int)s1.charAt(i-1)+dp[i-1][j];
                Integer ch2=(int)s2.charAt(j-1)+dp[i][j-1];
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=Math.min(ch1,ch2);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}