class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        //System.out.println(Arrays.toString(ans));
        if(ans.length%2==0){
            int n=ans.length/2;
            //System.out.println(ans[n-1]);
            //System.out.println(ans[n]);
            int ans1=ans[n-1]+ans[n];
            return (double)ans1/2;
        }
        return ans[ans.length/2];
    }
}