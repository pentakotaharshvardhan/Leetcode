class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        Stack<Integer> stk=new Stack<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            if(ans<heights[i]) ans=heights[i];
        }
        int[] left=new int[n];
        int[] right=new int[n];
        right[n-1]=-99;
        stk.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()) right[i]=-99;
            else right[i]=stk.peek();
            stk.push(i);
        }
        //System.out.println(Arrays.toString(right));
        while(!stk.isEmpty()) stk.pop();
        left[0]=-99;
        stk.push(0);
        for(int i=1;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()) left[i]=-99;
            else left[i]=stk.peek();
            stk.push(i);
        }
        //System.out.println(Arrays.toString(left));
        for(int i=0;i<n;i++){
            int t1=(left[i]==-99)?i:i-left[i]-1;
            int t2=(right[i]==-99)?n-i:right[i]-i;
            int temp=heights[i]*(t1+t2);
            //System.out.println(t1+" "+t2);
            if(temp>ans) ans=temp;
        }
        return ans;
    }
}