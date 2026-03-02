class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
        //System.out.println(hm);
        for(int i:hm.keySet()){
            int temp=Integer.MAX_VALUE;
            for(int j:hm.keySet()){
                if(i>=j) continue;
                if(hm.get(i)==hm.get(j)) continue;
                temp=Math.min(temp,j);
                //System.out.println(temp);
            }
            if(a>i){
                a=i;
                b=temp;
            }
        }
        if(a==Integer.MAX_VALUE || b==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{a,b};
    }
}