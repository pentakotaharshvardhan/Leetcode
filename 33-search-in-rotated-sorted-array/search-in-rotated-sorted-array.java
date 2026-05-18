class Solution {
    public int search(int[] nums, int target) {
        int pivat=pivat(nums);
        System.out.println(pivat);
        if(pivat==0){
            return binarySearch(nums,0,nums.length-1,target);
        }
        if(nums[pivat]==target){
            return pivat;
        }
        if(target>=nums[0]){
           return binarySearch(nums,0,pivat-1,target);
        }
        else{
           return binarySearch(nums,pivat+1,nums.length-1,target);
        }
       // return -1;
    }
    // 1 2 3 4 5
    static int pivat(int[] nums){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[high]<nums[mid]) low=mid+1;
            else high=mid;
        }
        return low;
    }
    static int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}