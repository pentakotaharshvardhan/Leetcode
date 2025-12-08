class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> stk=new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(stk.size()==0 || stk.peek()==c) stk.push(c);
            else stk.pop();
            //System.out.println(stk);
        }
        return stk.size();
    }
}