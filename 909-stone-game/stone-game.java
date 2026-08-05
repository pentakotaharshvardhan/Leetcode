class Solution {
    public boolean stoneGame(int[] piles) {
        int alice=0;
        int bob=0;
        int i=0;
        int j=piles.length-1;
        boolean istrue=true;
        while(i<=j){
            int temp=0;
            if(piles[i]<=piles[j]){
                temp=piles[j];
                j--;
            }
            else{
                temp=piles[i];
                i++;
            }
            if(istrue){
                alice+=temp;
            }
            else bob+=temp;
            istrue=!istrue;
        }
        return true;
    }
}