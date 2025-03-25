class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        else{
            long x=power(n,1);
            if(x==n) return true;
        }
        return false;
    }
    static long power(int n,long base){
        if(base>=n){
            return base;
        }
        return power(n,base*3);
    }
}