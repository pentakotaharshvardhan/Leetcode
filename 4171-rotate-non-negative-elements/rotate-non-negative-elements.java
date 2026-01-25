class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) ls.add(nums[i]);
        }
        System.out.println(ls);
        if(ls.size()==0) return nums;
        int[] arr=new int[ls.size()];
        k%=ls.size();
        for(int i=0;i<ls.size();i++){
            //System.out.println((i-k+ls.size())+" "+ls.size());
            arr[(i-k+ls.size())%(ls.size())]=ls.get(i);
        }
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) nums[i]=arr[m++];
        }
        return nums;
    }
}