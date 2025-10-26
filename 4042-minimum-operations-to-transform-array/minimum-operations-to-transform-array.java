class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        long ans=0;
        int n=nums2.length;
        for(int i=0;i<nums1.length;i++){
            ans+=(long)Math.abs(nums1[i]-nums2[i]);
        }
        long min=Long.MAX_VALUE;
        for(int ixd=0;ixd<nums1.length;ixd++){
            long t1=0;
            if((nums2[n-1]<=nums1[ixd] && nums2[n-1]<=nums2[ixd] && nums1[ixd]<=nums2[ixd]) ||
        (nums2[n-1]>=nums1[ixd] && nums2[n-1]>=nums2[ixd] && nums1[ixd]>=nums2[ixd])){
                t1=(long)Math.abs(nums2[n-1]-nums1[ixd]);
            }
            else{
                if((nums1[ixd]<=nums2[ixd] && nums2[ixd]<=nums2[n-1]) ||
                (nums1[ixd]>=nums2[ixd] && nums2[ixd]>=nums2[n-1])){
                    t1=(long)Math.abs(nums2[n-1]-nums2[ixd]);
                }
            }
            //System.out.println(t1);
            if(min>t1) min=t1;
        }
        //System.out.println(ans+" "+ixd);
        return ans+min+1;
    }
}