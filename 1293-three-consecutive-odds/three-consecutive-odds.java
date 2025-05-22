class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cur=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) cur++;
            else cur=0;
            if(cur==3) return true;
        }
        return false;
    }
}