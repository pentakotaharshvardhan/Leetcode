class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] arr=new int[n];
        arr[0]=costs[0]+1;
        if(n>1) arr[1]=Math.min(arr[0]+costs[1]+1,costs[1]+4);
        if(n>2) {
            arr[2]=Math.min(costs[2]+9,Math.min(arr[0]+arr[1]+costs[2]+1,arr[0]+costs[2]+4));
            arr[2]=Math.min(arr[2],arr[1]+costs[2]+1);
        }
        //if(n<4) return arr[n-1];
        for(int i=3;i<n;i++){
            int temp=Math.min(arr[i-3]+9,Math.min(arr[i-2]+4,arr[i-1]+1));
            arr[i]=temp+costs[i];
        }
        return arr[n-1];
    }
}