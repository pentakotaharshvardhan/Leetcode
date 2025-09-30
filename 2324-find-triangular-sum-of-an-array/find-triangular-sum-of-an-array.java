class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i:nums){
            ls.add(i);
        }
        while(ls.size()>1){
            List<Integer> ls2=new ArrayList<>();
            for(int i=0;i<ls.size()-1;i++){
                ls2.add((ls.get(i)+ls.get(i+1))%10);
            }
            ls=ls2;
        }
        return ls.get(0);
    }
}