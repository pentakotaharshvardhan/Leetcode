class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int m=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && k==0){
                nums[m]=nums[i];
                m++;
                k++;
            }
            else if(nums[i]!=nums[i+1]){
                k=0;
                nums[m]=nums[i];
                m++;
            }
        }
        nums[m++]=nums[nums.length-1];
        return m;
    }
}