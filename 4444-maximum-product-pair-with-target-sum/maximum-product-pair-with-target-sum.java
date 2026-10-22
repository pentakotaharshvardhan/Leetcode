class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int a=-1;
        int b=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[i]>nums[j] && target==(nums[i]+nums[j])){
                    if(max<(nums[i]*nums[j])){
                        a=i;
                        b=j;
                        max=nums[i]*nums[j];
                    }
                }
            }
        }
        return new int[]{a,b};
    }
}