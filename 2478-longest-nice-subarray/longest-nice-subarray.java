class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans=1;
        long add=nums[0];
        int count=1;
        int j=0;
        for(int i=1;i<nums.length;i++){
               // add=add|nums[i];
            while(j<i && (add & nums[i])!=0){
                //System.out.println(add+" "+j+" "+nums[j]);
                add=add^nums[j++];
                count--;
               }
               add=add|nums[i];
                count++;
            if(ans<count) ans=count;
        }
        return ans;
    }
}