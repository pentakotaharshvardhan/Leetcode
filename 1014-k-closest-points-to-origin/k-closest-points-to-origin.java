class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] distance=new double[points.length];
        int[][] ans=new int[k][2];
        for(int i=0;i<points.length;i++){
            distance[i]=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
        }
        // double[] sample=new double[points.length];
        // for(int i=0;i<sample.length;i++){
        //     sample[i]=distance[i];
        // }
        // int m=0;
        // Arrays.sort(distance);
        //System.out.println(Arrays.toString(sample));
        //System.out.println(Arrays.toString(distance));
        boolean[] istrue=new boolean[distance.length];
        for(int j=0;j<k;j++){
            int idx=0;
            double dis=10000000;
            for(int i=0;i<distance.length;i++){
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