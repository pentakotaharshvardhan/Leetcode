class Solution {
    public char findKthBit(int n, int k) {
        String st=generate("0",n-1);
        return st.charAt(k-1);
    }
    public static  String generate(String st,int k){
        if(k==0) return st;
         StringBuilder rev1=new StringBuilder(st);
        for(int i=0;i<rev1.length();i++){
            rev1.setCharAt(i,(rev1.charAt(i)=='1')?'0':'1');
        }
        return generate(st+'1'+rev1.reverse(),k-=1);
    }
}