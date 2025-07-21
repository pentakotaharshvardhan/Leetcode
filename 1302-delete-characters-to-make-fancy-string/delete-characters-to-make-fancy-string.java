class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty() || s.charAt(i-1)!=s.charAt(i)){
                count=0;
                stk.push(s.charAt(i));
            }
            else{
                count++;
                //System.out.println(s.charAt(i));
                if(count<2) stk.push(s.charAt(i));
            }
        }
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}