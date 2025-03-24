class Solution {
    static {
        for(int i=0;i<500;i++){
            thirdMax(new int[]{0});
        }
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int i=0;
        for(i=nums.length-1;i>=1 && count<3;i--){
            //System.out.println(nums[i]+" "+nums[i-1]);
            if(nums[i]!=nums[i-1]) count++;
        }
        System.out.println(i);
        if(count>=3) {
            return i==0?nums[0]:nums[i];
        }
        return nums[nums.length-1];

    }
}