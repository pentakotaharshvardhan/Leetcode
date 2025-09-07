class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        if(n==1) return ans;
        int k=1;
        for(int i=0;i<n/2;i++){
            ans[i]=k++;
        }
        if(n%2!=0) ans[n/2]=0;
        k-=1;
        k*=-1;
        int i=(n%2==0)?n/2:n/2+1; 
        for( ;i<n;i++){
            ans[i]=k++;
        }
        return ans;
    }
}