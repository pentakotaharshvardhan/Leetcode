class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> arr=new ArrayList<>();
        long mod=(long)(1e9+7);
        for(int i=0;i<nums.length;i++){
             arr.add((long)nums[i]);
             long sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=(long)sum+nums[j];
                arr.add(sum);
            }
        }
        long ans=0;
        Collections.sort(arr);
        //System.out.println(arr);
        for(int i=left-1;i<right;i++){
            ans=(long)ans+arr.get(i);
          //  if(i%10000==0) System.out.println(ans);
        }
        //System.out.println(ans%mod);
        return (int)(ans%mod);
    }
}