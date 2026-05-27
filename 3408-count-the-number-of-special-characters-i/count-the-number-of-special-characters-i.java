class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if('a'<=ch && ch<='z'){
                char ch1=(char)('A'+(int)(ch-'a'));
                if(!hs.contains(ch) && hs.contains(ch1)){
                    ans++;
                }
                hs.add(ch);
            }
            else{
                char ch1=(char)('a'+(int)(ch-'A'));
                if(!hs.contains(ch) && hs.contains(ch1)){
                    ans++;
                }
                hs.add(ch);
            }
        }
        return ans;
    }
}