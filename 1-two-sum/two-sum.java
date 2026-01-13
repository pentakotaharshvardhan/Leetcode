class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++) hm.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hm.containsKey(temp) && hm.get(temp)!=i) return new int[]{i,hm.get(temp)};
        }
        return new int[]{-1,-1};
    }
}