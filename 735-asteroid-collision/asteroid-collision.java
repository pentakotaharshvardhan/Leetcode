class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int a=asteroids[i];
            int b=Math.abs(a);
            if(a<0){
                while(!stk.isEmpty() && stk.peek()<b && stk.peek()>=0){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek()<0 && a<0) stk.push(a);
                if(!stk.isEmpty() && stk.peek()==b && stk.peek()>=0) stk.pop();
                else if(stk.isEmpty()) stk.push(a);
            }
            else stk.push(a);
        }
        int[] ans=new int[stk.size()];
        int i=stk.size()-1;
        while(!stk.isEmpty()) ans[i--]=stk.pop();
        return ans;
    }
}