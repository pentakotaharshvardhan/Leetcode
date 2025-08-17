class Solution {
    public long maxProfit(int[] prices, int[] s, int k) {
        int n=prices.length;
        long[] each=new long[n];
        long[] temp=new long[n];
        long[] prefix1=new long[n];
        long[] prefix2=new long[n];
        long ans=0;
        for(int i=0;i<n;i++){
            each[i]=prices[i]*s[i];
            ans+=each[i];
        }
        prefix1[0]=each[0];
        prefix2[0]=prices[0];
        for(int i=1;i<n;i++){
            prefix1[i]=prefix1[i-1]+each[i];
            prefix2[i]=prefix2[i-1]+prices[i];
        }
        //System.out.println(Arrays.toString(prefix1));
        //System.out.println(Arrays.toString(prefix2));
        for(int i=0;i<=n-k;i++){
            //System.out.println(prefix1[k-1+i]);
            long t1=prefix1[n-1]-prefix1[k-1+i];
            long t2=prefix2[k-1+i];
            //System.out.println(t1);
            if(i!=0){
                t1+=prefix1[i-1];
                //t2-=prefix2[i-1];
            }
            //System.out.println(t1+" "+t2);
            t2-=prefix2[i+(k/2)-1];
            //System.out.println(t2);
            t1=t1+t2;
            //System.out.println(t1);
            if(ans<t1) ans=t1;
        }
        //System.out.println(ans);
        return ans;
    }
}