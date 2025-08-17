class Solution {
    public int sortPermutation(int[] nums) {
        int ans=Integer.MAX_VALUE;
        boolean isdesc=true;
        boolean isasc=true;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) isdesc=false;
            if(nums[i-1]>nums[i]) isasc=false;
            if(max<nums[i]) max=nums[i];
        }
        if(isdesc) return 0;
        if(isasc) return 0;
        int[] ixd=new int[max+1];
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            ixd[nums[i]]=i;
        }
        Arrays.sort(arr);
        for(int i=nums.length-1;i>=0;i--){
            if(ixd[arr[i]]==i) continue;
            ans=ans & arr[i]&nums[i];
            ixd[nums[i]]=ixd[arr[i]];
            nums[ixd[arr[i]]]=nums[i];
            //System.out.println(arr[i]+" "+nums[i]+" "+ans);
        }
        // for(int i=0;i<nums.length;i++){
        //     ixd[nums[i]]=i;
        // }
        // //System.out.println("***");
        // int ans2=ans;
        // for(int i=0;i<nums.length;i++){
        //     if(ixd[arr[i]]==i) continue;
        //     int temp=arr[i]&nums[i];
        //     ixd[nums[i]]=ixd[arr[i]];
        //     nums[ixd[arr[i]]]=nums[i];
        //     if(temp<ans) ans=temp;
        //     //System.out.println(arr[i]+" "+nums[i]+" "+ans);
        // }
        // if(ans2<ans) return ans2;
        return ans;
    }
}