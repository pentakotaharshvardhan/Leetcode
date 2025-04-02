class Solution {
    public int mirrorReflection(int p, int q) {
        int total=lcm(p,q);
        int np=total/p;
        int nq=total/q;
        if(np%2==0) return 0;
        if(nq%2==0) return 2;
        return 1;
    }
    static int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b%a,a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}