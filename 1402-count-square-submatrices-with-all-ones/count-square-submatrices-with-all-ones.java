class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] arr=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            arr[i][0]=0;
        }
        for(int i=0;i<m+1;i++){
            arr[0][i]=0;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(matrix[i-1][j-1]==0) continue;
                int temp=arr[i-1][j-1];
                int temp2=Math.min(arr[i-1][j],arr[i][j-1]);
                arr[i][j]=Math.min(temp,temp2)+1;
            }
        }
        int ans=0;
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
    }
}