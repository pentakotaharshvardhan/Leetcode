class Solution {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        int max=Integer.MIN_VALUE;
        long sum=0;
        for(int i:candies){
            max=Math.max(max,i);
            sum+=i;
        }
        //if(sum<k) return 0;
        long start=1;
        long end=sum/k;
        long  mid=0;
        //boolean istrue=false;
        while(start<=end){
            mid=start+(end-start)/2;
            long count=0;
            for(int x:candies){
                if(mid<=x) count+=x/mid;
            }
            if(count>=k) start=mid+1;
            else end=mid-1;
        }
        //if(!istrue) return 0;
        //System.out.println(end);
        return (int)end;
    }
}