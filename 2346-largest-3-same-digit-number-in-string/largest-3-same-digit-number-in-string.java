class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int i=0;
        for(int j=0;j<num.length()-2;j++){
            String ch1=num.charAt(j)+"";
            String ch2=num.charAt(j+1)+"";
            String ch3=num.charAt(j+2)+"";
            if(ch1.equals(ch2) && ch2.equals(ch3) && ch3.equals(ch1)){
                String temp=ch1+ch2+ch3+"";
                //System.out.println(temp);
                if(ans.compareTo(temp)<=0) ans=temp;
            }
        }
        return ans;
    }
}