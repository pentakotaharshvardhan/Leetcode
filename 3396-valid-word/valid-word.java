class Solution {
    public boolean isValid(String word) {
        int no=3;
        boolean vowel=false;
        boolean cons=false;
        word=word.toLowerCase();
        //System.out.println(word);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if('a'<=ch && ch<='z'){
                if(ch=='a' || ch=='i' || ch=='u' || ch=='e' || ch=='o'){
                    vowel=true;
                }
                else{
                    cons=true;
                }
            }
            else if('0'<=ch && ch<='9') continue;
            else return false;
        }
        //System.out.println(vowel+" "+cons+" "+count);
        if(vowel && cons && word.length()>=3 ) return true;
        return false;
    }
}