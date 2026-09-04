class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        int i=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
        }
        while(i<nums.length){
            int temp=0;
            int t1=nums[i];
            while(i<nums.length && nums[i]==t1){
                temp++;
                i++;
            }
            if(temp==hm.get(t1)) ans++;
        }
        return ans;
    }
}