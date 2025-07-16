class Solution {
    public void rotate(int[] nums, int k) {
        int N=nums.length-k%nums.length;
        reverse(nums,0,N-1);
        reverse(nums,N,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    static void reverse(int[] arr,int start,int end){
        int last=end;
        for(int i=start;i<=(end+start)/2;i++){
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            --last;
        }
    }
}