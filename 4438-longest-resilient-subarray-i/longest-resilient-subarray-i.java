class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i]%k;
        System.out.println(Arrays.toString(arr));
        int i=0;
        int max=1;
        int j=0;
        for(j=0;j<nums.length;j++){
            if(arr[j]!=0){
                max=Math.max(max,j-i);
                i=j+1;
            }
        }
        max=Math.max(max,j-i);
        System.out.println(max);
        i=0;
        j=0;
        int nex=arr[0];
        for(j=1;j<nums.length;j++){
            if(arr[j]==nex){
                if(((j-i)*nex)%k==0){
                    max=Math.max(max,(j-i+1));
                }
                System.out.println(i+" "+j+" "+max);
            }
            else{
                i=j;
            }
            nex=arr[j];
        }
        if((j-i)%(k+1)==0) max=Math.max(max,j-i);
        return max;
    }
}