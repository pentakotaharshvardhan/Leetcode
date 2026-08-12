class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=0;
        int end=1000000000;
        if((long)m*k>bloomDay.length) return -1;
        System.out.println((long)m*k);
        while(start<end){
            int mid=start+(end-start)/2;
            long bouquest=helper(bloomDay,k,mid);
            //System.out.println(bouquest+" "+mid+" "+start+" "+end);
            if(bouquest<m) start=mid+1;
            else end=mid;
        }
        return end;
    }
    public static long helper(int[] nums,int k,int day){
        long ans=0;
        int[] arr=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day) arr[i]+=++total;
            else arr[i]=total;
        }
        //System.out.println(Arrays.toString(arr));
        int i=0;
        while(i<=nums.length-k){
            int j=i+k-1;
            int temp=i-1>=0?arr[j]-arr[i-1]:arr[j];
            //System.out.println(i+" "+j+" "+temp);
            if(temp>=k){
                //System.out.println("*");
                ans++;
                i+=k;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}