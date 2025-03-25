class Solution {
    public int countGoodNumbers(long n) {
        long mod=(long)1e9+7;
        long mid=n/2;
        long even=Math.ceilDiv(n,2);
        long odd= n - even;
        // if(mid%2==0){
        //     even=n/2;
        //     odd=n/2;
        // }
        // else{
        //     even=(n/2)+1;
        //     odd=n/2;
        // }
        long evenp = modPow(5, even, mod);
        System.out.println(evenp);

        long oddp = modPow(4, odd, mod);
        System.out.println(oddp);

        return (int)((evenp * oddp) % mod);

    }
    public static long modPow(long base, long exp, long mod) {
    long result = 1;
    base %= mod;
    
    while (exp > 0) {
        if ((exp & 1) == 1) {  
            result = (result * base) % mod;
        }
        base = (base * base) % mod;  
        exp >>= 1;  
    }
    
    return result;
}

}