class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            if(ch.equals("(")) stk.push("(");
            if(ch.equals(")")){
                int temp=0;
                if(stk.peek().equals("(")){
                    stk.pop();
                    if(!stk.isEmpty() && !stk.peek().equals("(")){
                        temp=Integer.parseInt(stk.pop())+1;
                        stk.push(temp+"");
                    }
                    else stk.push("1");
                }
                else{
                    temp=Integer.parseInt(stk.pop());
                    //System.out.println(stk);
                    if(stk.peek().equals("(")){
                        stk.pop();
                        temp*=2;
                    }
                    if(!stk.isEmpty() && !stk.peek().equals("(")){
                        temp+=Integer.parseInt(stk.pop());
                    }
                    //if(!stk.isEmpty()) stk.pop();
                    stk.push(temp+"");
                }
            }
            System.out.println(stk);
        }
        return Integer.parseInt(stk.pop());
    }
}