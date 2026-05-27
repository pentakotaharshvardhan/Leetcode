class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        HashSet<Character> small=new HashSet<>();
        HashSet<Character> large=new HashSet<>();
        boolean[] alpha=new boolean[27];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if('a'<=ch && ch<='z'){
                char ch1=(char)('A'+(int)(ch-'a'));
                if(!alpha[(int)(ch-'a')] && small.contains(ch) && large.contains(ch1)){
                    ans--;
                    alpha[(int)(ch-'a')]=true;
                }
                small.add(ch);
            }
            else{
                char ch1=(char)('a'+(int)(ch-'A'));
                if(!large.contains(ch) && small.contains(ch1)){
                    System.out.println(ch+" "+ch1);
                    ans++;
                }
                else if(!large.contains(ch)) alpha[(int)(ch1-'a')]=true;
                large.add(ch);
            }
        }
        return Math.max(0,ans);
    }
}