class Solution {
    public int uniqueLetterString(String s) {
        int ans=0;
        int n=s.length();
        int[] ch=new int[26];
        int[] prev=new int[n];
        int[] next=new int[n];
        Arrays.fill(ch,n);
        for(int i=n-1;i>=0;i--){
            int c=s.charAt(i)-'A';
            next[i]=ch[c];
            ch[c]=i;
        }
        Arrays.fill(ch,-1);
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'A';
            prev[i]=ch[c];
            ch[c]=i;
        }

        for(int i=0;i<n;i++){
            int pre=prev[i];
            int nex=next[i];
            ans+=(i-pre)*(nex-i);
        }
        return ans;
    }
}