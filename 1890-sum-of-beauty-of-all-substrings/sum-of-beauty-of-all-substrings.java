class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int[] arr=new int[26];
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    char ch=s.charAt(k);
                    arr[(int)(ch-'a')]++;
                }
                //System.out.println(Arrays.toString(arr));
                for(int k=0;k<26;k++){
                    if(arr[k]!=0){
                        max=Math.max(max,arr[k]);
                        min=Math.min(min,arr[k]);
                    }
                }
                ans+=Math.max(0,max-min);
            }
        }
        return ans;
    }
}