class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder str=new StringBuilder();
        for(int i:nums) str.append(i+"");
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=(char)(digit+'0');
            if(str.charAt(i)==ch) count++;
        }
        return count;
    }
}