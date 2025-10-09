class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
    public int helper(int[] nums,int start,int end){
        int max=0;
        int prev=0;
        for(int i=start;i<=end;i++){
            int temp=Math.max(max,prev+nums[i]);
            prev=max;
            max=temp;
        }
        return max;
    }
}