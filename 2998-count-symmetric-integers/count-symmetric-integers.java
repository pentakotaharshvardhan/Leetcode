class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            int m=i;
            int total1=0;
            int total2=0;
            if(9<m && m<100){
                int temp=m%10;
                total1+=temp;
                m/=10;
                total2+=m;
                if(total1==total2) ans++;
            }
            else if(999<m && m<10000){
                for(int k=0;k<2;k++){
                    int temp=m%10;
                    total1+=temp;
                    m=m/10;
                }
                for(int k=0;k<2;k++){
                    int temp=m%10;
                    total2+=temp;
                    m=m/10;
                }
                if(total1==total2) ans++;
            }
        }
        return ans;
    }
}