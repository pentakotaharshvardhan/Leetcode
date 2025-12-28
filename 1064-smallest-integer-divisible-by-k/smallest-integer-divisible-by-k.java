class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int t1=0;
        for(int i=1;i<=k;i++){
            t1=(t1*10+1)%k;
            if(t1==0) return i;
        }
        return -1;
    }
}