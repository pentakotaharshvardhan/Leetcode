class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }
    static void MergeSort(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            //System.out.println(start+" "+mid+" "+end);
            MergeSort(nums,start,mid);
            MergeSort(nums,mid+1,end);
            Merge(nums,start,mid,end);
        }
    }
    static void Merge(int[] nums,int start,int mid,int end){
        int[] arr1=new int[mid-start+1];
        int[] arr2=new int[end-mid];
        //int[] newArr=new int[end-start+1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=nums[start+i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=nums[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                nums[k++]=arr2[j++];
            }
            else{
                nums[k++]=arr1[i++];
            }
        }
        while(i<arr1.length){
            nums[k++]=arr1[i++];
        }
        while(j<arr2.length){
            nums[k++]=arr2[j++];
        }
    }
}