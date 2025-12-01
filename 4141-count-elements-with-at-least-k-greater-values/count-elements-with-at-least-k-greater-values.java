class Solution {
    public int countElements(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        //System.out.println(hm);
        Arrays.sort(nums);
        int ans=0;
        for(int i=n-1;i>=0;i--){
            int t1=n-i;
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(t1-hm.get(nums[i])>=k) ans+=1;
        }
        return ans;
    }
}