class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0) nums[k]=pos.get(i++);
            else nums[k]=neg.get(j++);
        }
        return nums;
    }
}