class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] arr=new int[26];
        int max=0;
        for(int i=0;i<s.length();i++){
            int k=(int)s.charAt(i)-'a';
            arr[k]++;
            if(arr[k]>max) max=arr[k];
        }
        System.out.println(max);
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<26;i++){
            if(arr[i]==0) continue;
            hm.put(arr[i],hm.getOrDefault(arr[i],"")+(char)('a'+i)+"");
        }
        //System.out.println(hm);
        String ans="";
        int pri=0;
        for(int i:hm.keySet()){
            String str=hm.get(i);
            if(str.length()>ans.length()) {
                ans=str;
                pri=i;
            }
            else if(str.length()==ans.length() && pri<i) ans=str;
        }
        return ans;
    }
}