class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length*matrix.length;
        int []arr=new int[n];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                arr[k++]=matrix[j][i];
            }
        }
        k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=arr[k++];
            }
        }
    }
}