class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums) hs.add(i);
        for(int i=1;i<=nums.length;i++){
            int num=k*i;
            if(!hs.contains(num)) return num;
        }
        return k*(nums.length+1);
    }
}