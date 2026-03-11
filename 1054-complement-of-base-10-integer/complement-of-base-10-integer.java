class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0') s.append("1");
            else s.append("0");
        }

        return Integer.parseInt(s.toString(),2);
    }
}