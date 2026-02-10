class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> even=new HashSet<>();
            HashSet<Integer> odd=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2!=0) odd.add(nums[j]);
                else even.add(nums[j]);
                //System.out.println(odd.size()+" "+even.size());
                if(even.size()==odd.size()) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}