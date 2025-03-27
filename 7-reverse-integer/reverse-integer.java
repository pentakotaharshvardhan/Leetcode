class Solution {
    public int reverse(int x) {
        boolean isnegat=false;
        if(x<0) isnegat=true;
        StringBuilder str=new StringBuilder();
        if(Integer.MIN_VALUE>=x || Integer.MAX_VALUE<=x) return 0;
        x=Math.abs(x);
        if(x==0) return 0;
        while(x>0){
            int n=x%10;
            str.append(n);
            x/=10;
        }
        String str1=str.toString();
        //System.out.println(str1);
        long m=Long.parseLong(str1.toString());
        if(Integer.MIN_VALUE>m || Integer.MAX_VALUE<m) return 0;
        return isnegat?-1*(int)m:(int)m;
    }
}