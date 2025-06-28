class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans=new int[k];
        int j=0;
        PriorityQueue<Integer> pos = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
        PriorityQueue<Integer> neg=new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg.add(i);
            else pos.add(i);
        }
        while(!pos.isEmpty() && k>0){
            ans[j++]=pos.poll();
            k--;
        }
        while(!neg.isEmpty() && k>0){
            ans[j++]=neg.poll();
            k--;
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[ans[i]];
        }
        return ans;
    }
}