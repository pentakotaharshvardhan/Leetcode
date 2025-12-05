class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i:nums) total+=i;
        int temp=0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            temp+=nums[i];
            if(Math.abs(total-2*temp)%2==0) ans++;
        }
        return ans;
    }
}