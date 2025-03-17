class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=ranks[0];
        int max=ranks[0];
        for(int x:ranks){
            if(min>x) min=x;
            if(max<x) max=x;
        }
        long start=0;
        long end=Math.abs((long)max*cars*cars);
        long mid=0;
        int count=0;
        //System.out.println(start+" "+mid+" "+end);
        while(start<=end){
            mid=start+(end-start)/2;
            count=groups(ranks,mid);
            //System.out.println(start+" "+mid+" "+end);
            //System.out.println(count);
            if(count<cars) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    static int groups(int[] ranks,long mid){
        int ans=0;
        for(int x:ranks){
            long k=mid/x;
            ans+=Math.sqrt(k);
        }
        return ans;
    }
}