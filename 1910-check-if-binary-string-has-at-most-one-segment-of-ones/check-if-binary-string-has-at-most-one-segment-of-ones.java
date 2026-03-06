class Solution {
    public boolean checkOnesSegment(String s) {
        boolean istrue=false;
        int ixd=-1;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='1'){
                if(ixd==-1) ixd=i;
                else{
                    if(i+1!=ixd) return false;
                }
                ixd=i;
            }
        }
        return true;
    }
}