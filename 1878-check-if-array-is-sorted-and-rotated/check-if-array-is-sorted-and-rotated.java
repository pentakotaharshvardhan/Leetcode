class Solution {
    public boolean check(int[] nums) {
        int ixd=pivot(nums,nums.length);
        int n=nums.length;
        System.out.println(ixd);
        for(int i=0;i<nums.length-1;i++){
            if(nums[(ixd+i)%n]>nums[(ixd+i+1)%n]) return false;
        }
        return true;
    }
    public static int pivot(int[] arr,int n){
        // int low=0;
        // int high=n-1;
        // while(low<high){
        //     int mid=low+(high-low)/2;
        //     if(nums[mid]<nums[high]) high=mid;
        //     else if(nums[mid]>nums[high]) low=mid+1;
        //     else high--;
        // }
        // return low;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return i+1;
        }
        return 0;
    }
}