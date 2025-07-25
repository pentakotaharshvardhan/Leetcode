class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]) arr.add(nums[i]);
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean istrue=false;
        for(int x:arr){
            if(x>=0){
                sum+=x;
                istrue=true;
            }
            else{
                //System.out.println(max);
                if(max<x) max=x;
            }
        }
        if(!istrue) return max;
        return sum;
    }
}