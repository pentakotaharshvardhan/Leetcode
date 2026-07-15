class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        helper(n,k,"",0,0,ans);
        return ans;
    }
    public void helper(int n,int k,String str,int idx,int sum,List<String> ans){
        if(str.length()==n && sum<=k){
            ans.add(str);
            return ;
        }
        if(str.length()>n || sum>k) return ;
        helper(n,k,str+0,idx+1,sum,ans);
        if(idx==0) helper(n,k,str+1,idx+1,sum+idx,ans);
        if(idx!=0 && str.charAt(idx-1)!='1') helper(n,k,str+1,idx+1,sum+idx,ans);
    }
}