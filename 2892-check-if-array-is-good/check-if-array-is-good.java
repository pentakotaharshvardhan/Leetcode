class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        if(nums.length==1) return false;
        for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i=1;i<nums.length;i++){
            if(!hm.containsKey(i)) return false;
            if(i==nums.length-1 && hm.get(i)!=2) return false;
            if(i!=nums.length-1 && hm.get(i)!=1) return false; 
        }
        return true;
    }
}