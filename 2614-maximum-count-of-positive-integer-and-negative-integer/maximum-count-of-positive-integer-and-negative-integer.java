class Solution {
    public int maximumCount(int[] nums) {
        int max=0;
        int min=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=0) end=mid-1;
            else start=mid+1;
        }
        System.out.println(end);
        min=end;
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>0) end=mid-1;
            else start=mid+1;
        }
        max=start;
        System.out.println(start);
        return Math.max(Math.abs(min-0+1),Math.abs(nums.length-max));
    }
}