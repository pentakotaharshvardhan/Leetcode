class Solution {
    public int minimumFlips(int n) {
        String str=Integer.toBinaryString(n);
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=rev.charAt(i)) count++;
        }
        return count;
    }
}