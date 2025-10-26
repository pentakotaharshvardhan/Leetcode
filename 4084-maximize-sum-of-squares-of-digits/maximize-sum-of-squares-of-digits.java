class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans=new StringBuilder();
        if(num*9<sum) return "";
        int div=sum/9;
        while(div-->0){
            ans.append("9");
        }
        if(sum%9!=0){
            ans.append(sum%9);
            sum=0;
        }
        int len=num-ans.length();
        for(int i=0;i<len;i++){
            ans.append("0");
        }
        return ans.toString();
    }
}