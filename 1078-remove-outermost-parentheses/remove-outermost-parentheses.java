class Solution {
    public String removeOuterParentheses(String s) {
        int i=0;
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='('){
                if(count==0) {
                    i=j;
                }
                count++;
            }
            else{
                count--;
                if(count==0){
                    if(i+1<j){
                        str.append(s.substring(i+1,j));
                    }
                }
            }
        }
        return str.toString();
    }
}