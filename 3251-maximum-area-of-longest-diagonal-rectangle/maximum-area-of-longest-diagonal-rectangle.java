class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int ans=0;
        double dm=0;
        for(int i=0;i<d.length;i++){
            double temp=Math.sqrt(d[i][1]*d[i][1] +d[i][0]*d[i][0]);
            //System.out.println(temp+" "+d[i][1]*d[i][0]);
            if(dm<=temp){
                if(Math.abs(dm-temp)<0.000000001){
                    ans=Math.max(ans,d[i][1]*d[i][0]);
                } 
                else ans=d[i][1]*d[i][0];
                dm=temp;
            }
        }
        //System.out.println(ans);
        return ans;
    }
}