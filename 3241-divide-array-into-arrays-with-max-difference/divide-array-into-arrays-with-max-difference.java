class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int div=nums.length/3;
        int[][] ans=new int[div][3];
        int ixd=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(b-a>k || c-a>k || c-b>k){
                return new int[][]{};
            }
            ans[ixd][0]=a;
            ans[ixd][1]=b;
            ans[ixd++][2]=c;
        }
        return ans;
    }
}