class Solution {
    public int minOperations(int[] nums, int[] target) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target[i]) hs.add(nums[i]);
        }
        return hs.size();
    }
}