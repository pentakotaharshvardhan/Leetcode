class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=1;
        int ixd=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                ans++;
                nums[ixd++]=nums[i+1];
            }
        }

        return ans;
    }
}