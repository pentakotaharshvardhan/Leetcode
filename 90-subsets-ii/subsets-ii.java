class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    static void helper(List<List<Integer>> ans,List<Integer> ls,int[] nums,int start){
        ans.add(new ArrayList<Integer>(ls));
        for(int i=start;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue; 
            ls.add(nums[i]);
            helper(ans,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    }
}