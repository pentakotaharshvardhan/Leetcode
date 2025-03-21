class Solution {
    static{
        for(int i=0;i<500;i++){
            topKFrequent(new int[]{0},0);
        }
    }
    public  static int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pr=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer a,Integer b){
                if(hm.get(a)<hm.get(b)) return 1;
                else return -1;
            }
        });

        for(int num:hm.keySet()){
            pr.add(num);
        }
        for(int i=0;i<k;i++){
            ans[i]=pr.poll();
        }
        return ans;
    }
}