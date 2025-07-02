class Solution {
    public int possibleStringCount(String word) {
        int ans=1;
        for(int i=0;i<word.length()-1;i++){
            char ch=word.charAt(i);
            char ch1=word.charAt(i+1);
            if(ch==ch1){
                ans++;
            }
            
        }
        return ans;
    }
}