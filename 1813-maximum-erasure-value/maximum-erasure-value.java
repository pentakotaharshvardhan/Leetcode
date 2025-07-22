class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int finish=0;
        int start=0;
        int max=0;
        while(finish!=nums.length){
            int k=nums[finish];
            if(hm.containsKey(k)){
                int m=hm.get(k);
                while(start<=m){
                    max-=nums[start++];
                }
            }
            max+=k;
            if(ans<max) ans=max;
            hm.put(k,finish);
            finish++;
            //System.out.println(max);
        }
        return ans;
    }
}