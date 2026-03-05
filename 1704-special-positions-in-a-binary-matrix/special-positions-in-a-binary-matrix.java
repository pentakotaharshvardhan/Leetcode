class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int ans=0;
        int m=mat[0].length;
        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0) a[i][j]=mat[i][j];
                else{
                    a[i][j]=mat[i][j]+a[i][j-1];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0) b[j][i]=mat[j][i];
                else{
                    b[j][i]=mat[j][i]+b[j-1][i];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && a[i][m-1]==1 && b[n-1][j]==1) ans++;
            }
        }
        return ans;
    }
}