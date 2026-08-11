class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int max=0;
        for(int num:hs){
            int temp=0;
            if(!hs.contains(num+1)){
                while(hs.contains(num)){
                    num--;
                    temp++;
                }
                max=Math.max(temp,max);
            }
        }
        return max;
    }
}