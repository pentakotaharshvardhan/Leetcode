class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans=0;
        int n=nums.length;
        int sum=0;
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=i*nums[i];
            sum+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                ans=temp;
            }
            else{
                temp+=sum-(n*nums[i+1]);
                if(ans<temp) ans=temp;
            }
        }
        return ans;
    }
}