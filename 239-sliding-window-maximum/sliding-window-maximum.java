class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        if(n==1) return nums;
        boolean[] istrue=new boolean[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        for(int i=0;i<k;i++){
            pq.add(i);
        }
        int i=0;
        int j=k-1;
        while(j<n){
            while(istrue[pq.peek()]){
                pq.poll();
            }
            ans[i]=nums[pq.peek()];
            //pq.remove(nums[i]);
            istrue[i]=true;
            i++;
            j++;
            if(j<n) pq.add(j);
        }
        return ans;
    }
}