class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,m=0;
        int j=x;
        while(x!=0){
            m=x%10;
            rev=rev*10+m;
            x=x/10;
        }
        if(rev==j && j>=0){
            return true;
        }
        else{
            return false;
        }
    }
}