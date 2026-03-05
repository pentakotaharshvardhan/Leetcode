class Solution {
    public int minOperations(String s) {
        int ans=0;
        int ans2=0;
        for(int i=0;i<s.length();i++){
            if((i%2==0 && s.charAt(i)=='0')|| (i%2!=0 && s.charAt(i)=='1')) ans2++;
            if((i%2!=0 && s.charAt(i)=='0')|| (i%2==0 && s.charAt(i)=='1')) ans++;
        }
        return Math.min(ans,ans2);
    }
}