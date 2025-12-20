class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if((int)(strs[j].charAt(i)-'a')>(int)(strs[j+1].charAt(i)-'a')){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}