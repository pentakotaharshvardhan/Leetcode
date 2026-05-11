class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder str=new StringBuilder();
        for(int i:nums) str.append(i+"");
        int[] ans=new int[str.length()];
        for(int i=0;i<str.length();i++){
            ans[i]=Integer.parseInt(str.charAt(i)+"");
        }
        return ans;
    }
}