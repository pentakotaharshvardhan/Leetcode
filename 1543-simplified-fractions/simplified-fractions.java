class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(i==j) continue;
                if(gcd(i,j)==1) ans.add(""+i+"/"+j);
            }
        }
        return ans;
    }
    static int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b%a,a);
    }
}