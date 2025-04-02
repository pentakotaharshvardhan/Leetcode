class Solution {
    public int rob(int[] nums) {
        int ans=0;
        int[] money=new int[nums.length];
        if(nums.length==1) return nums[0];
        money[0]=nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        money[1]=nums[1];
        if(nums.length==3) return Math.max(nums[0]+nums[2],nums[1]);
        money[2]=nums[2]+money[0];
        for(int i=3;i<nums.length;i++){
            money[i]+=nums[i]+Math.max(money[i-2],money[i-3]);
        }
        return Math.max(money[nums.length-1],money[nums.length-2]);
    }
}