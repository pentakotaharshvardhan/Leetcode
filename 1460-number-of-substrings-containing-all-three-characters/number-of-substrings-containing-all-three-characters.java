class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int a=-1;
        int b=-1;
        int c=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') a=i;
            if(ch=='b') b=i;
            if(ch=='c') c=i;
            if(a!=-1 && b!=-11 && c!=-11){
                int t1=Math.min(a,Math.min(b,c));
                ans+=t1+1;
                //System.out.println(i+" "+ans);
            }
        }
        return ans;
    }
}