class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long temp=1;
        int t1=n;
        while(t1>0){
            int a=t1%10;
            sum+=a;
            temp*=a;
            t1/=10;
        }
        return n%(sum+temp)==0;
    }
}