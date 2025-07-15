class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk=new Stack<Integer>();
        int ans=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //System.out.println(ch);
            if (ch == '(') {
                stk.push(i);
            } else if (ch == ')') {
                if (!stk.isEmpty() && s.charAt(stk.peek()) == '(') {
                    m = stk.pop(); // matched pair
                } else {
                    stk.push(i); // unmatched ')'
                }
            }
        }
        //System.out.println(stk);
        int prev=s.length();
        while(!stk.isEmpty()){
            int k=stk.pop();
            if(ans<prev-k-1) ans=prev-k-1;
            //System.out.println(prev-k-1);
            prev=k;
            //System.out.println(prev+" "+ans);
        }
        if(prev>ans) ans=prev;
        return ans;
    }
}