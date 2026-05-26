class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!hs.contains(ch) && ('a'<=ch && ch<='z')){
                ans+=1;
                hs.add(ch);
            }
            else if(!hs.contains(ch) && ('A'<=ch && ch<='Z')){
                ans+=2;
                hs.add(ch);
            }
            else if(!hs.contains(ch) && ('0'<=ch && ch<='9')){
                ans+=3;
                hs.add(ch);
            }
            else{
                if(!hs.contains(ch)){
                    ans+=5;
                    hs.add(ch);
                }
            }
        }
        return ans;
    }
}