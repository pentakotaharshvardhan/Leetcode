class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        int[] diff=new int[n+1];
        for(int[] arr:bookings){
            int s=arr[0];
            int e=arr[1];
            diff[s]+=arr[2];
            if(e+1<n+1) diff[e+1]-=arr[2];
        }
        int sum=0;
        System.out.println(Arrays.toString(diff));
        for(int i=1;i<diff.length;i++){
            sum+=diff[i];
            ans[i-1]=sum;
        }
        return ans;
    }
}