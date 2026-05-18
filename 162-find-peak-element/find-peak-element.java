class Solution {
    public int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length;
        if(arr.length==1){
            return 0;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            else if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
            System.out.println(start+" "+end);
        }
        return 0;
    }
}