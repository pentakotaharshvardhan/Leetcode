class Solution {
    public boolean divideArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>max) max=x;
        }
        int[] arr=new int[max+1];
        for(int x:nums){
            arr[x]++;
        }
        for(int x:arr){
            if(x%2!=0) return false;
        }
        return true;
    }
}