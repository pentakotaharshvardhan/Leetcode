class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int[] arr=new int[nums1.length];
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0) even++;
            else odd++;
            if(nums1[i]%2!=0){
                temp=Math.min(temp,nums1[i]);
            }
            arr[i]=temp;
        }
        if((even==nums1.length) || (odd==nums1.length)) return true;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                if(temp>nums1[i]) return false;
            }
        }
        return true;
    }
}