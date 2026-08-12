// class Solution {
//     public boolean search(int[] nums, int target) {
//         int ixd=findPivot(nums);
//         //int ixd=i-1>=0?i-1:nums.length-1;
//         System.out.println(ixd);
//         if(nums[ixd]==target) return true;
//         if(nums[0]<=target) return binarySearch(nums,0,ixd-1,target);
//         return binarySearch(nums,ixd,nums.length-1,target);
//     }
//     public static int findPivot(int[] nums) {
//         int low = 0, high = nums.length - 1;

//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] < nums[high]) {
//                 high = mid;
//             } else if (nums[mid] > nums[high]) {
//                 low = mid + 1;
//             } else {
//                 high--; // duplicate case
//             }
//         }
//         return low;
//     }
//     static boolean binarySearch(int[] nums,int start,int end,int target){
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]==target){
//                 return  true;
//             }
//             else if(nums[mid]>target) end=mid-1;
//             else start=mid+1;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return false;        
    }
}