class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        double[] distance=new double[n];
        int[][] ans=new int[k][2];
        for(int i=0;i<n;i++){
            distance[i]=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
        }
        boolean[] istrue=new boolean[n];
        for(int j=0;j<k;j++){
            int idx=0;
            double dis=10000000;
            for(int i=0;i<n;i++){
                if(distance[i]<dis && !istrue[i]) {
                    idx=i;
                    dis=distance[i];
                }
            }
            ans[j]=points[idx];
            istrue[idx]=true;
        }
        
        return ans;
    }
}