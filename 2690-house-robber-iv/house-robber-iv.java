class Solution {
    public int minCapability(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            if(min>x) min=x;
            if(max<x) max=x;
        }
        int start=min;
        int end=max;
        int mid=0;
        //System.out.println(start+" "+end);
        while(start<=end){
            mid=start+(end-start)/2;
            //System.out.println(start+" "+mid+" "+end);
            int count=groups(nums,mid);
            //System.out.println(count);
            if(k<=count) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
    static int groups(int[] nums,int mid){
        int ans=0;
        boolean istrue=false;
        for(int x:nums){
            if(!istrue && x<=mid){
                //System.out.println(x);
                ans++;
                istrue=true;
            }
            else istrue=false;
        }
        return ans;
    }
}