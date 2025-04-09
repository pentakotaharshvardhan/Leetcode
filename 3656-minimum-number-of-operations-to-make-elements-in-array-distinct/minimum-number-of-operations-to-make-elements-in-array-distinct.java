class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] dulp=new int[max+1];
        for(int i=0;i<nums.length;i++){
            dulp[nums[i]]++;
        }
        int i=0;
        while(isdulp(dulp) && i+2<nums.length){
            dulp[nums[i]]--;
            dulp[nums[i+1]]--;
            dulp[nums[i+2]]--;
            i+=3;
            ans++;
        }
        if(isdulp(dulp)) ans++;
        return ans;
    }
    public boolean isdulp(int[] dulp){
       // System.out.println(Arrays.toString(dulp));
        for(int i=0;i<dulp.length;i++){
            if(dulp[i]!=0 && dulp[i]!=1) return true;
        }
        return false;
    }
}