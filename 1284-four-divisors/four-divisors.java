class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int j=0;j<nums.length;j++){
            int t1=(int)Math.sqrt(nums[j]);
            HashSet<Integer> hs=new HashSet<>();
            for(int i=1;i<=t1;i++){
                if(nums[j]%i==0){
                    hs.add(i);
                    hs.add(nums[j]/i);
                } 
                if(hs.size()>4)break;
            }
            if(hs.size()==4){
                for(int i:hs) ans+=i;
            }
            //System.out.println(ans+" "+n);
        }
        return ans;
    }
}