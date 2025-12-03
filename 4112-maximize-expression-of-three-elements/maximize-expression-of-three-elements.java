class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int t1=nums[0]+nums[1]-nums[nums.length-1];
        int t2=nums[nums.length-1]+nums[nums.length-2]-nums[0];
        return Math.max(t1,t2);
    }
}