class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==0){
                count++;
                arr[ch-'a']=1;
            }
        }
        return count;
    }
}