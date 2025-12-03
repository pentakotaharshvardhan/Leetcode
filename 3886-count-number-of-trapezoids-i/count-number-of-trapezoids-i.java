class Solution {
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int mod=1000000007;
        for(int i=0;i<points.length;i++){
            hm.put(points[i][1],hm.getOrDefault(points[i][1],0)+1);
        }
        long temp=0;
        long[] t1=new long[hm.size()];
        long[] pre=new long[hm.size()];
        int k=0;
        for(int i:hm.keySet()){
            t1[k++]=nCr(hm.get(i));
        }
        pre[0]=t1[0];
        for(int i=1;i<t1.length;i++){
            pre[i]=t1[i]+pre[i-1];
        }
        //System.out.println(Arrays.toString(t1));
        //System.out.println(Arrays.toString(pre));
        for(int i=0;i<t1.length-1;i++){
            long t2=(t1[i]*(pre[t1.length-1]-pre[i]))%mod;
            temp=(temp+t2)%mod;
        }
        return (int)temp;
    }
    public static long nCr(int n){
        if (n < 2) return 0;
        return (long)n * (n - 1) / 2;
    }
}