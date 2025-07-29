class Solution {
    public String removeKdigits(String num, int k) {
        //41032 1
        Stack<Character> stk=new Stack<>();
        StringBuilder ans=new StringBuilder();
        stk.push(num.charAt(0));
        for(int i=1;i<num.length();i++){
            char ch=num.charAt(i);
            while(!stk.isEmpty() && k>0 && (int)(ch-'0')<(int)(stk.peek()-'0')){
                stk.pop();
                k--;
            }
            stk.push(ch);  
        }
        //System.out.println(stk);
        while(!stk.isEmpty() && k>0) {
            stk.pop();
            k--;
        }
        while(!stk.isEmpty()) ans.append(stk.pop());
        while(ans.length()>0 && ans.charAt(ans.length()-1)=='0') ans.deleteCharAt(ans.length()-1);
        if(ans.length()==0) ans.append("0");
        return ans.reverse().toString();
    }
}