class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        if(i>=s.length()) return "";
        StringBuilder t1=new StringBuilder();
        int temp=0;
        for(int m=0;m<101;m++) t1.append("1");
        String ans=t1.toString();
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='1') temp++;
            if(temp==k){
                while(i<j && s.charAt(i)=='0') i++;
                String str=s.substring(i,j+1);
                if(str.length()<=ans.length()){
                    if(str.length()==ans.length()){
                        if(str.compareTo(ans)<0) ans=str;
                    }
                    else ans=str;
                    // System.out.println(i+" "+j);
                    // System.out.println(ans);
                }
                i++;
                while(i<j && s.charAt(i)!='1') i++;
                temp--;
            }
        }
        return ans.equals(t1.toString())?"":ans;
    }
}