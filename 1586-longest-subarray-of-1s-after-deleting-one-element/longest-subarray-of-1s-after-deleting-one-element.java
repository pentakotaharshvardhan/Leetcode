class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            if(nums[i]==0){
                ls.add(count);
                count=0;
            }
        }
        ls.add(count);
        if(ls.size()==1) return ls.get(0)-1;
        for(int i=0;i<ls.size()-1;i++){
            if(ans<(ls.get(i)+ls.get(i+1))) ans=ls.get(i)+ls.get(i+1);
        }
        //System.out.println(ls);
        return ans;
    }
}