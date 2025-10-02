class Solution {
    public long splitArray(int[] nums) {
        //System.out.println(nums.length);
        int ixd=nums.length-1;
        boolean istrue=false;
        boolean inc=true;
        for(int i=1;i<nums.length;i++){
            if(inc && nums[i-1]>nums[i] ) {
                ixd=i-1;
                inc=false;
            }
            if(!inc && nums[i-1]<=nums[i] ) return -1;
            if(!istrue && nums[i-1]==nums[i]){
                istrue=true;
                ixd=i-1;
                inc=false;
            }
            else if((istrue || !inc) && nums[i-1]==nums[i]) return -1;
        }
        //System.out.println(ixd);
        long t1=0;
        long t2=0;
        for(int i=0;i<=ixd;i++){
            t1+=(long)nums[i];
        }
        for(int i=ixd+1;i<nums.length;i++){
            t2+=(long)nums[i];
        }
        long ans=Math.abs(t1-t2);
        if(!istrue) ans=Math.min(ans,(long)Math.abs(t1-nums[ixd]-t2-nums[ixd]));
        //System.out.println(ans);
        return ans;
    }
}