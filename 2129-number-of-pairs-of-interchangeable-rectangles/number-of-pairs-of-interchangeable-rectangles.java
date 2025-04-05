class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans=0;
        HashMap<Double,Long> hm=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            int num=rectangles[i][0];
            int den=rectangles[i][1];
            double frac=den*1.0/num;
            //System.out.println(frac);
            hm.put(frac,hm.getOrDefault(frac,(long)0)+1);
        }
        for(double n:hm.keySet()){
            long k=hm.get(n)-1;
            ans+=(k*(k+1))/(long)2;
        }
        //System.out.println(hm);
        return ans;
    }
}