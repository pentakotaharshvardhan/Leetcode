class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        int ans=helper(num,steps);
        return ans;
    }
    public static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}