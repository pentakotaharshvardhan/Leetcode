class Solution {
    public String customSortString(String order, String s) {
        List<Character> alpha=new ArrayList<>();
        String ans="";
        boolean[] istrue=new boolean[s.length()];
        for(int i=0;i<order.length();i++){
            for(int j=0;j<s.length();j++){
                if(order.charAt(i)==s.charAt(j)){
                    ans+=s.charAt(j)+"";
                    istrue[j]=true;
                }
            }
        }
        for(int i=0;i<istrue.length;i++){
            if(!istrue[i]) alpha.add(s.charAt(i));
        }
        Collections.sort(alpha);
        for(int i=0;i<alpha.size();i++){
            ans+=alpha.get(i)+"";
        }
        return ans;
    }
}