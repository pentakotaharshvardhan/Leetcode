class Solution {
    public int minimumK(int[] nums) {
        int start=1;
        int end=100000;
        //for(int i:nums) end=Math.max(end,i);
        while(start<end){
            int mid=start+(end-start)/2;
            long temp=(long)mid*mid;
            if(count(nums,mid)<=temp) end=mid;
            else start=mid+1;
        }
        return start;
    }
    public int count(int[] nums,int temp){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=Math.ceilDiv(nums[i],temp);
        }
        return total;
    }
}