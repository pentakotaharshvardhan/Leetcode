class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1) return 2147483647;
        int ans=Math.floorDiv(dividend,divisor);
        if(ans>0) return ans;
        if(ans==(dividend/divisor))return ans;
        return ans+1;
    }
}