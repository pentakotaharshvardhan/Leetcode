class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] max=new int[nums.length];
        int[] min=new int[nums.length];
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            temp=Math.max(temp,nums[i]);
            max[i]=temp;
        }
        temp=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            temp=Math.min(temp,nums[i]);
            min[i]=temp;
        }
        //System.out.println(Arrays.toString(max));
        //System.out.println(Arrays.toString(min));
        for(int i=0;i<nums.length;i++){
            if((max[i]-min[i])<=k) return i;
        }
        return -1;
    }
}