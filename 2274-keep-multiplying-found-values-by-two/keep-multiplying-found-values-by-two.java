class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=original;
        while(true){
            boolean istrue=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==ans){
                    istrue=true;
                    ans=2*ans;
                }
            }
            //System.out.println(ans);
            if(!istrue) break;
        }
        return ans;
    }
}