class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        int temp=0;
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]<k) {
                ls.add(nums[i]);
                arr[nums[i]]++;
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ans.length;i++) ans[i]=ls.get(i);
        return ans;
    }
}