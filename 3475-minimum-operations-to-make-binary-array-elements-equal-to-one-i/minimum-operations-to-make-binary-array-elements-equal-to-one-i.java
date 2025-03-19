class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int i=0;
        int j=0;
        int k=0;
        for(i=0;i<nums.length-2;i++){
            if(nums[i]==1){
                continue;
            }
            j=i+1;
            k=j+1;
            if(nums[i]==0) nums[i]=1;
            if(nums[j]==0) nums[j]=1;
            else nums[j]=0;
            if(nums[k]==0) nums[k]=1;
            else nums[k]=0;
            ans++;
            //System.out.println(Arrays.toString(nums));
        }
        for(int m=0;m<nums.length;m++){
            if(nums[m]==0) return -1;
        }
        return ans;
    }
}