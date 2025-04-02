class Solution {
    static{
        maximumTripletValue(new int[]{0});
    }
    public static long maximumTripletValue(int[] nums) {
        long ans=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long temp=(nums[i]-nums[j])*(long)nums[k];
                    if(temp>ans) ans=temp;
                }
            }
        }
        if(ans<0) return 0;
        return ans;
    }
}