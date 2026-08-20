class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> stk=new Stack<>();
        Stack<Integer> stk1=new Stack<>();
        stk.push(nums[0]);
        stk1.push(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(stk.peek()>stk1.peek()) stk.push(nums[i]);
            else stk1.push(nums[i]);
        }
        int i=nums.length-1;
        while(!stk1.isEmpty()) ans[i--]=stk1.pop();
        while(!stk.isEmpty()) ans[i--]=stk.pop();
        return ans;
    }
}