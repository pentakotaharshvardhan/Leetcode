class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i:nums) if(i!=0) ls.add(i);
        for(int i=0;i<nums.length;i++){
            if(i<ls.size()) nums[i]=ls.get(i);
            else nums[i]=0;
        }
    }
}