class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int i=1;i<n;i++){
            boolean istrue=false;
            int temp=i;
            while(!istrue && temp>0){
                int t1=temp%10;
                if(t1==0) istrue=true;
                temp/=10;
            }
            temp=n-i;
            while(!istrue && temp>0){
                int t1=temp%10;
                if(t1==0) istrue=true;
                temp/=10;
            }
            if(istrue) continue;
            arr[0]=i;
            arr[1]=n-i;
            return arr;
        }
        return arr;
    }
}