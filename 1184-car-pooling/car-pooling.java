class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<trips.length;i++){
            max=Math.max(trips[i][2],max);
        }
        int[] arr=new int[max+2];
        for(int i=0;i<trips.length;i++){
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]-=trips[i][0];
        }
        System.out.println(Arrays.toString(arr));
        if(arr[0]>capacity) return false;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>capacity) return false;
        }
        return true;
    }
}