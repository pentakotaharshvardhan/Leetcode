class Solution {
    public int minimumIndex(List<Integer> nums) {
        int num=nums.get(0);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
        }
        int temp=0;
        for(int i:hm.keySet()){
            if(temp<hm.get(i)){
                temp=hm.get(i);
                num=i;
            }
        }
        //System.out.println(num+" "+temp);
        int t1=0;
        for(int i=0;i<nums.size()-1;i++){
            int sizea=i+1;
            if(nums.get(i)==num) t1+=1;
            //System.out.println(t1+" "+sizea/2+" "+(temp-t1)+" "+(nums.size()-i-1)/2);
            if(t1!=0 && t1>sizea/2 && (temp-t1)>(nums.size()-i-1)/2){
                return i;
            }
        }
        return -1;
    }
}