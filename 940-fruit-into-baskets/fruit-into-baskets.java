class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        int temp1=fruits[0];
        int temp2=-99;
        int ixd1=0;
        int ixd2=-99;
        int count=1;
        for(int i=1;i<fruits.length;i++){
            if(temp1==fruits[i]){
                ixd1=i;
            }
            else if(temp2==-99 || temp2==fruits[i]){
                if(temp2==-99) temp2=fruits[i];
                ixd2=i;
            }
            if(temp1!=fruits[i] && temp2!=fruits[i]){
                if(ans<count) ans=count;
                if(ixd1>ixd2){
                    count=i-ixd2-1;
                    temp2=fruits[i];
                    ixd2=i;
                }
                else{
                    count=i-ixd1-1;
                    temp1=fruits[i];
                    ixd1=i;
                }
                //System.out.println(temp1+" "+temp2+" "+ixd1+" "+ixd2+" "+count);

            }
            //System.out.println(temp1+" "+temp2+" "+ixd1+" "+ixd2+" "+count);
            count++;
            //count++;
        }
        if(ans<count) ans=count;
        return ans;
    }
}