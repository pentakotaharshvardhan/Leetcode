class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=1000000000;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long hr=helper(piles,mid);
            if(hr>h) start=mid+1;
            else{
                end=mid-1;
                ans=mid;
            }
            System.out.println(hr+" "+start+" "+end);
        }
        return ans;
    }
    public static long helper(int[] nums,int k){
        long total=0;
        for(int i:nums){
            total+=i/k;
            if(i%k!=0) total++;
        }
        return total;
    }
}