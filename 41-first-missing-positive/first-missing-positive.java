class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int start=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) hs.add(nums[i]);
        }
        while(hs.contains(start)) start++;
        return start;
    }
}