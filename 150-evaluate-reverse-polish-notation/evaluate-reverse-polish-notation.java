class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        int operator1 = 0;
        int operator2 =0;
        int temp=0;
        for(int i=0;i<tokens.length;i++){
            boolean char1=false;
            try {
                 temp = Integer.parseInt(tokens[i]);
            }
            catch(NumberFormatException e){
                char1=true;
            }
            if(!(char1)){
                stk.push(temp);
            }
            else{
                operator2=stk.pop();
                operator1=stk.pop();
            }
            if(tokens[i].equals("+")){
                stk.push(operator1+operator2);
            }
            if(tokens[i].equals("-")){
                stk.push(operator1-operator2);
            }
            if(tokens[i].equals("*")){
                stk.push(operator1*operator2);
            }
            if(tokens[i].equals("/")){
                stk.push(operator1/operator2);
            }
        }
        return stk.pop();
    }
}