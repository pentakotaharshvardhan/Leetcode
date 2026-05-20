class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        boolean[] istrue=new boolean[52];
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            int temp=0;
            if(i==0){
                istrue[A[i]]=true;
                if(istrue[B[i]]) temp++;
                else istrue[B[i]]=true;
                ans[0]=temp;
            }
            else{
                if(istrue[A[i]]) temp++;
                else istrue[A[i]]=true;
                if(istrue[B[i]]) temp++;
                else istrue[B[i]]=true;
                ans[i]=ans[i-1]+temp;
            }
        }
        return ans;
    }
}