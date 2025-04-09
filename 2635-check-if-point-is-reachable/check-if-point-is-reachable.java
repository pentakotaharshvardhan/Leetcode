class Solution {
    public boolean isReachable(int targetX, int targetY) {
        return Integer.bitCount(gcd(targetX,targetY))==1;
    }
    static int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b%a,a);
    }
}