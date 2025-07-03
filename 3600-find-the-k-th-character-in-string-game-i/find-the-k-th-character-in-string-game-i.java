class Solution {
    public char kthCharacter(int k) {
        String ans="a";
        while(ans.length()<=k){
            String temp="";
            for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)=='z'){
                    temp=temp+'a';
                }
                else{
                    char ch=ans.charAt(i);
                    temp=temp+(char)(ch+1);
                }
            }
            ans=ans+temp;
        }
        return ans.charAt(k-1);
        
    }
}