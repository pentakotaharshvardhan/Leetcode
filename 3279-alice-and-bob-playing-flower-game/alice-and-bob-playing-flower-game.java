class Solution {
    public long flowerGame(int n, int m) {
        long ans=0;
        int odd=0;
        int even=0;
        even=n/2;
        odd=m%2!=0?m/2+1:m/2;
        ans+=(long)even*odd;
        even=m/2;
        odd=n%2!=0?n/2+1:n/2;
        ans+=(long)even*odd;
        return ans;
    }
}