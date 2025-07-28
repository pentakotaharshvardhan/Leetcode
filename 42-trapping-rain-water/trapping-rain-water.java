class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        right[n-1]=-99;
        int ans=0;
        int max=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=(height[i]>max)?-99:max;
            if(max<height[i]) max=height[i];
        }
        max=height[0];
        left[0]=-99;
        for(int i=1;i<n;i++){
            left[i]=(height[i]>max)?-99:max;
            if(max<height[i]) max=height[i];
        }
        for(int i=0;i<n;i++){
            if(left[i]!=-99 && right[i]!=-99){
                ans+=Math.min(left[i],right[i])-height[i];
            }
        }
        return ans;
    }
}