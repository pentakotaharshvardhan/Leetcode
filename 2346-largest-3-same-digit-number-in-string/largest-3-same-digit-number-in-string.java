class Solution {
    public String largestGoodInteger(String num) {
        int ans=-999;
        int i=0;
        String str=num.charAt(0)+"";
        for(int j=1;j<num.length();j++){
            if(num.charAt(i)==num.charAt(j)){
                str=str+num.charAt(j);
            }
            else{
                str=num.charAt(j)+"";
                i=j;
            }
            if(str.length()==3){
                int temp=Integer.parseInt(str);
                //System.out.println(temp);
                if(temp>=ans) ans=temp;
                i=j+1;
                str="";
            }
        }
        if(ans==-999) return "";
        if(ans==0) return "000";
        return ans+"";
    }
}