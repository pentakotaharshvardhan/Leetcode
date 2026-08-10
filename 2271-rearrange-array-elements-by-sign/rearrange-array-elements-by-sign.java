class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0) pos[i++]=nums[k];
            else neg[j++]=nums[k];
        }
        boolean istrue=true;
        i=0;
        j=0;
        for(int k=0;k<nums.length;k++){
            if(istrue) nums[k]=pos[i++];
            else nums[k]=neg[j++];
            istrue=!istrue;
        }
        return nums;
    }
}