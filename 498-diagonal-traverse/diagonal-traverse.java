class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n =mat.length;
        int m =mat[0].length;
        int[] ans=new int[n * m];
        int k=0;
        for (int i=0;i<n+m-1;i++) {
            List<Integer> temp = new ArrayList<>();
            int r = i<m?0:i-m+1;
            int c = i<m?i:m-1;
            while (r<n && c>=0) {
                temp.add(mat[r][c]);
                r++;
                c--;
            }
            if (i%2==0) {
                Collections.reverse(temp);
            }
            for (int val :temp) {
                ans[k++]=val;
            }
        }
        return ans;
    }
}

//(0,0)
//(0,1)(1,0)
//(2,0)(1,1)(0,2)
//(1,2)(2,1)
//(2,2)
//[1,2,3,4]
//[5,6,7,8]