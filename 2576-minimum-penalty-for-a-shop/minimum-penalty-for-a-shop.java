class Solution {
    public int bestClosingTime(String customers) {
        int ans=Integer.MAX_VALUE;
        int y=0;
        int n=0;
        int ixd=-1;
        for(int i=0;i<customers.length();i++){
            char ch=customers.charAt(i);
            if(ch=='Y') y++;
        }
        ans=y;
        //System.out.println(y);
        for(int i=0;i<customers.length();i++){
            char ch=customers.charAt(i);
            if(ch=='Y') y--;
            else n++;
            //System.out.println(y+n);
            if(ans>y+n){
                ixd=i;
                ans=y+n;
            }
        }
        return ixd+1;
    }
}