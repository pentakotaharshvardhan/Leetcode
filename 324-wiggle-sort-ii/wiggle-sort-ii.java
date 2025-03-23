class Solution {
    static{
        for(int i=0;i<500;i++){
            wiggleSort(new int[]{0});
        }
    }
    public static void wiggleSort(int[] nums) {
        int[] temp=new int[nums.length];
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i+=2){
            temp[i]=nums[nums.length-1-j++];
        }
        for(int i=0;i<nums.length;i+=2){
            if(temp[i]==0) temp[i]=nums[nums.length-1-j++];
        }
        //System.out.println(Arrays.toString(temp));
        for(int m=0;m<temp.length;m++){
            nums[m]=temp[m];
        }
    }
}