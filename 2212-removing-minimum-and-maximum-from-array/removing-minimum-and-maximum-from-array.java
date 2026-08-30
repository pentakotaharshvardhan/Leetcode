class Solution {
    public int minimumDeletions(int[] nums) {
        int minIxd=0;
        int maxIxd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minIxd]) minIxd=i;
            if(nums[i]>nums[maxIxd]) maxIxd=i;
        }
        //System.out.println(maxIxd+" "+minIxd);
        //case-1
        int temp=Math.min(minIxd+1,nums.length-minIxd)+Math.min(maxIxd+1,nums.length-maxIxd);
        //System.out.println(temp);
        temp=Math.min(temp,Math.max(minIxd,maxIxd)+1);
        temp=Math.min(temp,nums.length-Math.min(minIxd,maxIxd));
        return temp;
    }
}