class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        long root=(long)(Math.log(n)/Math.log(2));
        return Math.pow(2,root)==n;
    }
}