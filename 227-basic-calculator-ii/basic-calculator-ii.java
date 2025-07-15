class Solution {
    public int calculate(String s) {
        Stack<Integer> stk=new Stack<>();
        Stack<Character> operator=new Stack<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('+',1);
        hm.put('-',1);
        hm.put('/',3);
        hm.put('*',3);
        boolean istrue=false;
        int no=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ') continue;
            if('0'<=ch && ch<='9'){
                int n=Integer.parseInt(ch+"");
                no=no*10+n;
            }
            else{
                stk.push(no);
                no=0;
                //System.out.println(operator);
                while(!operator.isEmpty() && hm.getOrDefault(operator.peek(),0)>=hm.getOrDefault(ch,0)){
                    int n1=stk.pop();
                    int n2=stk.pop();
                    char op=operator.pop();
                    if(op=='+') stk.push(n1+n2);
                    else if(op=='-') stk.push(n2-n1);
                    else if(op=='/') stk.push(n2/n1);
                    else stk.push(n1*n2);
                }
                operator.push(ch);
            }
        }
        stk.push(no); 
       // System.out.println(stk);
        //System.out.println(operator);
        while(!operator.isEmpty()){
            int n1=stk.pop();
            int n2=stk.pop();
            char op=operator.pop();
            int cal=0;
            if(op=='+') cal=n1+n2;
            else if(op=='-') cal=n2-n1;
            else if(op=='*') cal=n1*n2;
            else cal=n2/n1;
            stk.push(cal);
            // System.out.println(cal);
            // System.out.println(stk);
        }
        return stk.peek();
    }
}