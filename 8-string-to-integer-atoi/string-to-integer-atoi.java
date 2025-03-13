class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int i=0;
        boolean space=false;
        boolean vsign=false;
        boolean sign=false;
        if(s.compareTo("-"+Integer.MAX_VALUE)==0) return Integer.parseInt(s);
        while(i<s.length()){
            if(s.charAt(i)==' ' && space) break;
            if((s.charAt(i)=='+' || s.charAt(i)=='-' )&& sign)  break;
            if(Character.isDigit(s.charAt(i))){
                ans=ans*10+(long)Integer.parseInt(""+s.charAt(i));
                if(ans>Integer.MAX_VALUE) ans=Integer.MAX_VALUE;
                if(ans<Integer.MIN_VALUE) ans=Integer.MIN_VALUE;
                space=true;
                sign=true;
            }
            if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                break;
            }
            if('!'<=s.charAt(i) && s.charAt(i)<='/'){
                space=true;
                if(s.charAt(i)!='+' && s.charAt(i)!='-') break;
            }
            if((s.charAt(i))=='-'){
                space=true;
                //ans=-1*ans;
                sign=true;
                vsign=true;
            }
            if(s.charAt(i)=='+'){
                space=true;
                sign=true;
            }
            i++;
        }
        if(vsign){
            if(ans==Integer.MAX_VALUE) ans++;
            return -1*(int)ans;
        }
        return (int)ans;
    }
}