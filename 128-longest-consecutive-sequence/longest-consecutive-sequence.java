class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=0;
        for(int i:hs){
            int count=1;
            if(!hs.contains(i-1)){
                int t1=i;
                while(hs.contains(t1+1)){
                    t1+=1;
                    count++;
                }
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}