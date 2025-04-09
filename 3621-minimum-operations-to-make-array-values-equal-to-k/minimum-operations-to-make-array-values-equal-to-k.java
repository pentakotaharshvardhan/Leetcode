class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        return hm.size();
    }
}