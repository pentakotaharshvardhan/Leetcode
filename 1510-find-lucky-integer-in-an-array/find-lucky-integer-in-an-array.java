class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(i==hm.get(i) && i>ans){
                ans=i;
            }
        }
        return ans;
    }
}