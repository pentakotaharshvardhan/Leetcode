class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m];
        for(int l=0;l<nums3.length;l++){
            nums3[l]=nums1[l];
        }
        int i=0;
        int endi=m;
        int j=0;
        int endj=n;
        int k=0;
        while(i<endi && j<endj){
            if(nums3[i]<nums2[j]){
                nums1[k]=nums3[i];
                i++;
            }
            else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<endi){
            nums1[k]=nums3[i++];
            k++;
        }
        while(j<endj){
            nums1[k]=nums2[j++];
            k++;
        }
    }
}