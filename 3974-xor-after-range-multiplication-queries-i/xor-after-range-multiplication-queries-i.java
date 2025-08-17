class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int ans=0;
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j+=queries[i][2]){
                long temp = ((long) nums[j] * queries[i][3]) % 1000000007;
                nums[j] = (int) temp;
            }
        }
        ans=nums[0];
        //System.out.println(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}