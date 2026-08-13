class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=1000000;
        while(start<end){
            int mid=start+(end-start)/2;
            int temp=helper(nums,mid);
            //System.out.println(temp+" "+mid+" "+start+" "+end);
            if(temp<=threshold) end=mid;
            else start=mid+1;
        }
        return end;
    }
    public static int helper(int[] nums,int k){
        int total=0;
        for(int i:nums){
            total+=Math.ceilDiv(i,k);
        }
        return total;
    }
}