class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            //System.out.println(hm+" "+nums[i]);
            if(hm.containsKey(nums[i])){
                //System.out.println("*");
                ans=Math.min(ans,Math.abs(i-hm.get(nums[i])));
            }
            int t1=nums[i];
            int t2=0;
            while(t1>0){
                t2=t2*10+t1%10;
                t1/=10;
            }
            hm.put(t2,i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}