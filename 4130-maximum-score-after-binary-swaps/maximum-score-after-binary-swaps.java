class Solution {
    public long maximumScore(int[] nums, String s) {
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            pq.add(nums[i]);
            if(ch=='1'){
                ans+=pq.poll();
            } 
        }
        return ans;
    }
}