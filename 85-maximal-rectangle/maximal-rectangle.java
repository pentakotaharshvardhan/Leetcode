import java.util.Stack;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if (matrix==null || n==0 || m==0) return 0;
        int[] h= new int[m+1]; 
        int ans=0;
        for (int i= 0;i<n;i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j=0;j<=m;j++) {
                if(j<m) {
                    h[j]=matrix[i][j]=='1'?h[j]+1:0;
                }
                while (!stack.isEmpty() && h[j]<h[stack.peek()]) {
                    int height=h[stack.pop()];
                    int width=stack.isEmpty()?j:j-stack.peek()-1;
                    ans=Math.max(ans,height*width);
                }
                stack.push(j);
            }
        }
        return ans;
    }
}
