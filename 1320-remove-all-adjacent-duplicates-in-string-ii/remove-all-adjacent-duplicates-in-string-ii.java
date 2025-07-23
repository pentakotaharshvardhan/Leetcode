class Solution {
    static{
        for(int i=0;i<500;i++){
            removeDuplicates("",0);
        }
    }
    public static String removeDuplicates(String s, int k) {
        StringBuilder ans=new StringBuilder();
        Stack<String> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String t="";
            if(!stk.isEmpty()) t=stk.peek();
            if(stk.isEmpty() || t.charAt(0)!=ch){
                stk.push(ch+"");
                continue;
            }
            String temp=stk.pop();
            temp+=ch+"";
            if(temp.length()!=k) stk.push(temp);
        }
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}