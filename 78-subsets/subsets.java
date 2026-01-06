class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        helper(list,new ArrayList<>(),nums,0);
        return list;
    }
    static void helper(List<List<Integer>> list,List<Integer> ls,int[] nums,int start){
        list.add(new ArrayList<>(ls));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            helper(list,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    } 
}